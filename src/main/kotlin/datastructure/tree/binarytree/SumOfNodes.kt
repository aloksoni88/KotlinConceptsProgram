package datastructure.tree

import datastructure.tree.binarytree.Node
import datastructure.tree.binarytree.buildBinaryTree

fun main() {
    val arr = intArrayOf(1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1)
    val root = buildBinaryTree(arr)
    val count = sumOfNodes(root)
    println("Sum of nodes is $count")
}

fun sumOfNodes(root: Node?) : Int {
    if (root == null) {
        return 0
    }
    val leftSum = sumOfNodes(root?.left)
    val rightSum = sumOfNodes(root?.right)
    return leftSum + rightSum + root?.value!!
}