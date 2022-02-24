package br.com.caioalbuquerque.java8features.example06;

import lombok.Data;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 22/02/2022
 */
@Data
public class BinaryTree {
    private final Logger LOGGER = java.util.logging.Logger.getLogger("BinaryTree");

    /** DESIGN PATTERNS - Singleton Implementation */
    private static BinaryTree INSTANCE = new BinaryTree();

    private TreeNode root;
    private TreeNode currentRoot;
    private int counter = 0;
    private int btLevel = 0;
    private int btLevelNodesLimit = 0;

    public static BinaryTree getInstance(){
        return INSTANCE;
    }

    public void add(int nodeValue) {
        addNodesFromLeftToRight(nodeValue);
        // TODO addNodesFromRightToLeft();
        // TODO addNodesRandonly();
    }

    private void addNodesFromLeftToRight(int nodeValue){
        if (root == null) {
            LOGGER.info("Level: " + btLevel);
            LOGGER.info("Limit: " + btLevelNodesLimit);
            LOGGER.info("Counter: " + counter);

            root = new TreeNode(nodeValue);
            LOGGER.info("Added Node with Value: " + nodeValue
                    + " with left child (" + root.getLeftChildNode() + ")"
                    + ", rigth child (" + root.getRightChildNode() + ")"
                    + " and parent (" + root.getParentNode() + ")");
            currentRoot = root;
            btLevelNodesLimit = calculatePower(btLevel);

            btLevel++;
            counter++;

            LOGGER.info("Level: " + btLevel);
            LOGGER.info("Limit: " + btLevelNodesLimit);
            LOGGER.info("Counter: " + counter);
        } else {
            LOGGER.info("Level: " + btLevel);
            LOGGER.info("Limit: " + btLevelNodesLimit);
            LOGGER.info("Counter: " + counter);

            if (currentRoot.getLeftChildNode() != null && currentRoot.getRightChildNode() != null) {
                LOGGER.info("Level: " + btLevel);
                LOGGER.info("Limit: " + btLevelNodesLimit);
                LOGGER.info("Counter: " + counter);

                if (counter < btLevelNodesLimit) {
                    LOGGER.info("Level: " + btLevel);
                    LOGGER.info("Limit: " + btLevelNodesLimit);
                    LOGGER.info("Counter: " + counter);
                    counter++;

                    if (btLevel == 2) {
                        currentRoot = currentRoot.getParentNode().getRightChildNode();
                    }

                    LOGGER.info("Level: " + btLevel);
                    LOGGER.info("Limit: " + btLevelNodesLimit);
                    LOGGER.info("Counter: " + counter);
                } else if (counter == btLevelNodesLimit) {
                    LOGGER.info("Level: " + btLevel);
                    LOGGER.info("Limit: " + btLevelNodesLimit);
                    LOGGER.info("Counter: " + counter);

                    TreeNode parent = currentRoot;
                    currentRoot = currentRoot.getLeftChildNode();
                    currentRoot.setParentNode(parent);
                    currentRoot.setLeftChildNode(new TreeNode(nodeValue));
                    LOGGER.info("Added Node with Value: " + nodeValue
                            + " with left child (" + (currentRoot.getLeftChildNode() == null
                                                    ? currentRoot.getLeftChildNode()
                                                    : currentRoot.getLeftChildNode().getNodeValue()) + ")"
                            + ", rigth child (" + (currentRoot.getRightChildNode() == null
                                                    ? currentRoot.getRightChildNode()
                                                    : currentRoot.getRightChildNode().getNodeValue()) + ")"
                            + " and parent (" + (currentRoot.getParentNode() == null
                                                    ? currentRoot.getParentNode()
                                                    : currentRoot.getParentNode().getNodeValue()) + ")");
                    btLevelNodesLimit = calculatePower(btLevel);
                    btLevel++;
                    counter = 0;

                    LOGGER.info("Level: " + btLevel);
                    LOGGER.info("Limit: " + btLevelNodesLimit);
                    LOGGER.info("Counter: " + counter);
                }
            }

            LOGGER.info("Level: " + btLevel);
            LOGGER.info("Limit: " + btLevelNodesLimit);
            LOGGER.info("Counter: " + counter);

            if (currentRoot.getLeftChildNode() == null) {
                currentRoot.setLeftChildNode(new TreeNode(nodeValue));
                LOGGER.info("Added Node with Value: " + nodeValue
                        + " with left child (" + (currentRoot.getLeftChildNode() == null
                                                    ? currentRoot.getLeftChildNode()
                                                    : currentRoot.getLeftChildNode().getNodeValue()) + ")"
                        + ", rigth child (" + (currentRoot.getRightChildNode() == null
                                                    ? currentRoot.getRightChildNode()
                                                    : currentRoot.getRightChildNode().getNodeValue()) + ")"
                        + " and parent (" + (currentRoot.getParentNode() == null
                                                    ? currentRoot.getParentNode()
                                                    : currentRoot.getParentNode().getNodeValue()) + ")");
                LOGGER.info("Level: " + btLevel);
                LOGGER.info("Limit: " + btLevelNodesLimit);
                LOGGER.info("Counter: " + counter);
            } else if (currentRoot.getRightChildNode() == null) {
                currentRoot.setRightChildNode(new TreeNode(nodeValue));
                LOGGER.info("Added Node with Value: " + nodeValue
                        + " with left child (" + (currentRoot.getLeftChildNode() == null
                                                    ? currentRoot.getLeftChildNode()
                                                    : currentRoot.getLeftChildNode().getNodeValue()) + ")"
                        + ", rigth child (" + (currentRoot.getRightChildNode() == null
                                                    ? currentRoot.getRightChildNode()
                                                    : currentRoot.getRightChildNode().getNodeValue()) + ")"
                        + " and parent (" + (currentRoot.getParentNode() == null
                                                    ? currentRoot.getParentNode()
                                                    : currentRoot.getParentNode().getNodeValue()) + ")");
                LOGGER.info("Level: " + btLevel);
                LOGGER.info("Limit: " + btLevelNodesLimit);
                LOGGER.info("Counter: " + counter);
            }
        }
    }

    /**
     * Method to calculate the limit number of nodes inside a reverse leveled binary tree
     * This limit is defined by the formula -> limit = 2ˆN
     *
     * @param power Root level is 0 | Root's child level is 1 | Each child level increases the level of the reversed leveled binary tree
     * @return Result of the power calculation
     */
    private int calculatePower(int power) {
        int answer = 1;

        for (int i=1; i<power; i++){
            answer = answer * 2;
        }

        return answer;
    }

    /**
     * This method never will be called.
     * It was introduced only to show that i can imagine all cenarios that a power calculation can have.
     *
     * @param power numer of times the numer is multiplied by itself
     * @return power calculation result
     */
    private int calculatePowerWithAllPossiblePowerIntegerValues(int power) {
        int answer = 1;

        if (power < 0) {
            return -1;
        } else if (power == 0) {
            return answer;
        } else if (power > 0) {
            for (int i = 1; i < power; i++) {
                answer = answer * 2;
            }
        }

        return answer;
    }
}