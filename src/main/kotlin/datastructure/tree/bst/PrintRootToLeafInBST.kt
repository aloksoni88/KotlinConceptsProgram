package datastructure.tree.bst

import datastructure.tree.binarytree.Node
import datastructure.tree.levelOrderTraversal2

fun main() {
    val arr = intArrayOf(9,4,2,5,15,8,11,16,13,19)
    var root: Node? = null
    for (i in 0..arr.size-1) {
        root = createBST(root, arr[i])
    }
    levelOrderTraversal2(root)
    println("==== Root to leaf paths are ==== ")
    findPath(root, ArrayList())
}

fun findPath(root: Node?, list: ArrayList<Int>) {
    if (root == null) {
        return
    }

    list.add(root.value)
    if (root.left == null && root.right == null) {
        printPath(list)
    } else {
        findPath(root.left, list)
        findPath(root.right, list)
    }
    list.removeAt(list.size-1)
}


fun printPath(list: ArrayList<Int>) {
    for (i in 0..list.size-1) {
        print("${list.get(i)} -> ")
    }
    println()
}
