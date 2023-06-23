package com.algoexpert.easy

import datastructure.tree.binarytree.Node
import datastructure.tree.bst.createBST
import datastructure.tree.levelOrderTraversal2

fun main() {
    val arr = intArrayOf(10,5, 2,5, 15, 1,13,22,14)
    var root: Node? = null
    for(i in 0..arr.size-1) {
        root = createBST(root,arr[i])
    }
    levelOrderTraversal2(root)
    println()
    println("closest value in BST")
    val closest = closestValueInBST(root, 3)
    println(closest)
}

fun closestValueInBST(root: Node?, targetValue: Int) : Int{
    if (root == null) {
        return -1
    } else if ((root.left == null && root.right == null) || root.value == targetValue) {
        return root.value
    } else{
        return closestValueInBST(root, targetValue, root.value)
    }
}

fun closestValueInBST(root: Node?, targetValue: Int, closestValue: Int) : Int{
    if (root == null) {
        return closestValue
    }
    var closest = closestValue
    if (Math.abs(root.value - targetValue) < Math.abs(closestValue - targetValue)) {
        closest = root.value
    }
    if (targetValue > root.value) {
        closest = closestValueInBST(root.right, targetValue, closest)
    } else {
        closest = closestValueInBST(root.left, targetValue, closest)
    }
    return closest
}