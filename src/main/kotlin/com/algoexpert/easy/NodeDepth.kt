package com.algoexpert.easy

fun main() {
    val tree = BinaryTree(1)
    tree.left = BinaryTree(2)
    tree.right = BinaryTree(3);

    tree.left!!.left = BinaryTree(4)
    tree.left!!.right = BinaryTree(5);
    tree.right!!.left = BinaryTree(6)
    tree.right!!.right = BinaryTree(7)

    tree.left!!.left!!.left = BinaryTree(8);
    tree.left!!.left!!.right = BinaryTree(9);


    levelOrderTraversal(tree)
    println()
    println("Node depth : ${nodeDepth(tree)}")
}

fun nodeDepth(root: BinaryTree?) : Int{
    return nodeDepth(root, 0)
}

fun nodeDepth(root: BinaryTree?, depth: Int) : Int {
    if (root == null) {
        return 0
    }
    return nodeDepth(root.left, depth+1) + nodeDepth(root.right, depth+1) + depth
}