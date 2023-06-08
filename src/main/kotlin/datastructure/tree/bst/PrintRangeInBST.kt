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
    println("Ranges are : ")
    printRange(root, 6, 15)

}

fun printRange(root: Node?, x: Int, y: Int) {
    if (root == null) {
        return
    }
    if (root.value >= x && root.value <= y) {
        printRange(root.left, x, y)
        print("${root.value}  ")
        printRange(root.right, x, y)
    }
    else if (root.value >= x) {
        printRange(root.left, x, y)
    } else {
        printRange(root.right, x, y)
    }
}