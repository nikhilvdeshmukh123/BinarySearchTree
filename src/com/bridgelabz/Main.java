package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binary = new BinarySearchTree();

        binary.insert(56);
        binary.insert(30);
        binary.insert(70);

        binary.inorderTraversal(binary.root);
    }
}