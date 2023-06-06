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
    println("After deletion of node")
    deleteNode(root, 50)

    levelOrderTraversal2(root)
    printTreeWithInorderTraversal(root)

}

fun deleteNode(root: Node?, deletionNode: Int) : Node? {
    if (root == null) {
        return null
    }
    if (root.value > deletionNode) {
        root.left = deleteNode(root.left, deletionNode)
    } else if (root.value < deletionNode) {
        root.right = deleteNode(root.right, deletionNode)
    } else {
        if (root.left == null && root.right == null) {
            return null
        } else if( root.left  == null) {
            return root.right
        } else if (root.right == null) {
            return root.left
        } else {
            val inorderSuccessor = findInorderSuccessor(root.right!!)
            root.value = inorderSuccessor.value
            root.right = deleteNode(root.right, inorderSuccessor.value)
        }
    }
    return root
}

fun findInorderSuccessor(root: Node) : Node {
    var r = root
    while (r.left != null) {
        r = r.left!!
    }
    return r
}