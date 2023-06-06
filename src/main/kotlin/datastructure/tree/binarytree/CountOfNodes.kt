package datastructure.tree

import datastructure.tree.binarytree.Node
import datastructure.tree.binarytree.buildBinaryTree

fun main() {
    val arr = intArrayOf(1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1)
    val root = buildBinaryTree(arr)
    val count = countOfNodes(root)
    println("Total node count is $count")
}

fun countOfNodes(root: Node?) : Int{
    if (root == null) {
        return 0
    }
    val leftNode = countOfNodes(root?.left)
    val rightNode = countOfNodes(root?.right)
    return leftNode + rightNode + 1
}