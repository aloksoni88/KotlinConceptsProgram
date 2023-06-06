package datastructure.tree.bst

import datastructure.tree.binarytree.Node
import datastructure.tree.binarytree.printTreeWithInorderTraversal
import datastructure.tree.levelOrderTraversal2

fun main() {
    //val arr = intArrayOf(8,5,3,6,1,4,10,11,15)
    val arr = arrayListOf(8,5,3,6,1,4,10,11,15)
    var root: Node?  = null
    for(i in 0..arr.size-1) {
        root = createBST(root, arr[i])
    }
    levelOrderTraversal2(root)
    printTreeWithInorderTraversal(root)
}

fun createBST( root: Node?, value: Int) : Node {
    if (root == null) {
        return Node(value)
    } else if (value < root.value) {
        root.left = createBST(root.left, value)
    } else {
        root.right = createBST(root.right, value)
    }
    return root
}
