package br.com.caioalbuquerque.java8features.examples.example06;

import lombok.Data;

/**
 * @author Caio Albuquerque
 * @since 22/02/2022
 */
@Data
public class TreeNode {
    private Integer key;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer key) {
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }
}