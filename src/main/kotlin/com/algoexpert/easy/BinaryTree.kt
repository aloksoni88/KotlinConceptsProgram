package com.algoexpert.easy

import datastructure.tree.binarytree.Node
import java.util.*

class BinaryTree(data: Int) {
    var value: Int = data
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun levelOrderTraversal(root: BinaryTree?) {
    if (root == null) {
        return
    }
    val queue: Queue<BinaryTree> = LinkedList()
    queue.add(root)
    while (!queue.isEmpty()) {
        var size = queue.size
        while (size > 0) {
            val currentNode = queue.poll()
            print("${currentNode.value}  ")
            currentNode.left?.let { queue.add(currentNode.left) }
            currentNode.right?.let { queue.add(currentNode.right) }
            size--
        }
        println()
    }
}