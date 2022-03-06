package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.model.binarytree.BinaryTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 06/03/2022
 */
@RestController
@RequestMapping("/binarytree")
public class BinaryTreeController {
    private static final Logger LOGGER = Logger.getLogger("BinaryTreeController");

    @GetMapping("/preorder")
    public void getPreOrderPrinted() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to print pre order binary tree");
        BinaryTree.getInstance().printPreOrder(BinaryTree.getInstance().getRoot());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/inorder")
    public void getInOrderPrinted() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to print in order binary tree");
        BinaryTree.getInstance().printInOrder(BinaryTree.getInstance().getRoot());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/postorder")
    public void getPostOrderPrinted() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to print post order binary tree");
        BinaryTree.getInstance().printPostOrder(BinaryTree.getInstance().getRoot());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/minkey")
    public void getMinKey() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to get minimum key of the binary tree");
        BinaryTree.getInstance().getMinKey(BinaryTree.getInstance().getRoot());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/maxkey")
    public void getMaxKey() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to get maximum key of the binary tree");
        BinaryTree.getInstance().getMaxKey(BinaryTree.getInstance().getRoot());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/height")
    public void getHeight() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to get height of the binary tree");
        LOGGER.info("   Height: " + BinaryTree.getInstance().getHeight(BinaryTree.getInstance().getRoot()));
        BinaryTree.getInstance().getHeight(BinaryTree.getInstance().getRoot());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }
}