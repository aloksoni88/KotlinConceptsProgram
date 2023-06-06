package datastructure.tree

import datastructure.tree.binarytree.Node
import datastructure.tree.binarytree.buildBinaryTree

fun main() {
    val arr = intArrayOf(1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1)
    val root = buildBinaryTree(arr)
    val height = heightOfTree(root)
    println("Height of tree is $height")
}

fun heightOfTree(root: Node?) : Int {
    if (root == null) {
        return 0
    }
    val leftHeight = heightOfTree(root?.left)
    val rightHeight = heightOfTree(root?.right)
    return Math.max(leftHeight, rightHeight) + 1
}