package br.com.caioalbuquerque.java8features.example06;

import lombok.Data;

/**
 * @author Caio Albuquerque
 * @since 22/02/2022
 */
@Data
public class TreeNode {
    private Integer nodeValue;
    private TreeNode leftChildNode;
    private TreeNode rightChildNode;
    private TreeNode parentNode;

    public TreeNode(Integer nodeValue) {
        this.nodeValue = nodeValue;
        this.leftChildNode = null;
        this.rightChildNode = null;
        this.parentNode = null;
    }
}