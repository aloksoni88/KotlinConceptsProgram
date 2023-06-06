package datastructure.tree.bst

import datastructure.tree.binarytree.Node
import datastructure.tree.binarytree.printTreeWithInorderTraversal
import datastructure.tree.levelOrderTraversal2

fun main() {
    val arr = arrayListOf(8,5,3,6,1,4,10,11,15)
    var root: Node?  = null
    for(i in 0..arr.size-1) {
        root = createBST(root, arr[i])
    }
    levelOrderTraversal2(root)
    printTreeWithInorderTraversal(root)
    println()
    val result = searchDataInBST(root, 0)
    println(result)
}

fun searchDataInBST(root: Node?, data: Int) : Boolean {
    if (root == null) {
        return false
    }

    if (root.value == data) {
        return true
    }

    if (data < root.value) {
        return searchDataInBST(root.left, data)
    } else {
        return searchDataInBST(root.right, data)
    }
}