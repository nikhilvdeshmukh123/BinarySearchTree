package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binary = new BinarySearchTree();

        binary.insert(56);
        binary.insert(30);
        binary.insert(70);
        binary.insert(22);
        binary.insert(40);
        binary.insert(11);
        binary.insert(3);
        binary.insert(16);
        binary.insert(60);
        binary.insert(95);
        binary.insert(65);
        binary.insert(63);
        binary.insert(67);

        binary.inorderTraversal(binary.root);
        binary.searchNode(binary.root, 63);
        if(BinarySearchTree.flag)
            System.out.println("\nElement is present");
        else
            System.out.println("\nElement is not present");
    }
}