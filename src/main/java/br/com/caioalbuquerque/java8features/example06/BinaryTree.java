package br.com.caioalbuquerque.java8features.example06;

import lombok.Data;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 22/02/2022
 */
@Data
public class BinaryTree {
    private static final Logger LOGGER = java.util.logging.Logger.getLogger("BinaryTree");
    private static BinaryTree INSTANCE = new BinaryTree();

    private TreeNode root;

    /**
     * Singleton instance of the binary tree
     * @return binary tree instance
     */
    public static BinaryTree getInstance(){
        return INSTANCE;
    }

    /**
     * Method that receives all binary tree input data
     *
     * @param key value used in binary tree operations to identify nodes
     */
    public void addNode(Integer key) {
        if (root == null) {
            root = new TreeNode(key);
            LOGGER.info("Adding root node ...");
            LOGGER.info("Root node: " + root);
            LOGGER.info(" ");
            return;
        }

        addNodesRecursively(root, key);
    }

    /**
     * Method that receives all binary tree elements, except the first one (root)
     *
     * @param current it's root in first execution, but it changes when traversal
     * @param nodeKey value used in binary tree operations to identify nodes
     * @return added node
     */
    private TreeNode addNodesRecursively(TreeNode current, Integer nodeKey) {
        if (current == null) {
            TreeNode newNode = new TreeNode(nodeKey);
            LOGGER.info("Adding node ...");
            LOGGER.info("Node: " + newNode);
            LOGGER.info(" ");
            return newNode;
        }

        if (nodeKey < current.getKey()) {
            LOGGER.info("New node key " + nodeKey + " smaller than current key " + current.getKey());
            current.setLeftChild(addNodesRecursively(current.getLeftChild(), nodeKey));
        } else if (nodeKey > root.getKey()) {
            LOGGER.info("New node key " + nodeKey + " bigger than current key " + current.getKey());
            current.setRightChild(addNodesRecursively(current.getRightChild(), nodeKey));
        } else {
            LOGGER.info("New node key " + nodeKey + " equals to current key");
            return current;
        }
        return current;
    }

    /**
     * Method to retrieve maximum binary tree key
     *
     * @param root search starting point
     * @return maximum key
     */
    public Integer getMaxKey(TreeNode root){
        if (root.getRightChild() == null) {
            LOGGER.info("Maximum key is: " + root.getKey());
            return root.getKey();
        } else {
            return getMaxKey(root.getRightChild());
        }
    }

    /**
     * Method to retrieve minimum binary tree key
     *
     * @param root search starting point
     * @return minimum key
     */
    public Integer getMinKey(TreeNode root) {
        if (root.getLeftChild() == null) {
            LOGGER.info("Minimum key is: " + root.getKey());
            return root.getKey();
        } else {
            return getMinKey(root.getLeftChild());
        }
    }
}