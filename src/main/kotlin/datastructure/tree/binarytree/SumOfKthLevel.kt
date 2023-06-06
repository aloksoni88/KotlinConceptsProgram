package datastructure.tree

import datastructure.tree.binarytree.Node
import java.util.LinkedList
import java.util.Queue

fun main() {
    buildTree()
    levelOrderTraversal(tree)
    val sum = sumOfKthLevel2(tree, 3)
    println("Sum of kth level is $sum")
}

fun sumOfKthLevel(root: Node?, level: Int) : Int {
    if (root == null) {
        return -1
    }
    val queue: Queue<Node> = LinkedList()
    var currentLevel = 1

    queue.add(root)
    queue.add(null)

    var sum = 0
    while (!queue.isEmpty()) {
        val currentNode = queue.poll()
        if (currentNode == null) {
            if (currentLevel == level) {
                return sum
            } else if (queue.isEmpty()) {
                break
            } else {
                queue.add(null)
            }
            currentLevel++
            sum = 0
        } else {
            sum = sum + currentNode.value
            currentNode.left?.let { queue.add(currentNode.left) }
            currentNode.right?.let { queue.add(currentNode.right) }
        }
    }
    return -1
}

fun sumOfKthLevel2(root: Node?, level: Int) : Int {
    if (root == null) {
        return -1
    }
    val queue: Queue<Node> = LinkedList()
    queue.add(root)
    var currentLevel = 1
    var sum = 0
    while(!queue.isEmpty()) {
        var size = queue.size
        while (size > 0) {
            val currentNode = queue.poll()
            if (level == currentLevel) {
                sum = sum + currentNode.value
            }
            currentNode.left?.let { queue.add(currentNode.left) }
            currentNode.right?.let { queue.add(currentNode.right) }
            size--
        }
        if (sum != 0) {
            return sum
        }
        currentLevel++

    }
    return -1
}