package datastructure.tree

import datastructure.tree.binarytree.Node

lateinit var tree : Node
lateinit var subtree: Node
fun  main() {
    buildTree()
    buildSubtree()

    levelOrderTraversal(tree)
    levelOrderTraversal(subtree)

    val result = isSubtree(tree, subtree)
    println(result)
}

fun buildTree() {
    tree = Node(9)
    tree.left = Node(7)
    tree.right = Node(1)

    tree.left?.left = Node(8)
    tree.left?.right = Node(1)

    tree.left?.right?.left = Node(2)
    tree.left?.right?.right = Node(8)
    tree.left?.right?.right?.left = Node(10)

    tree.right?.left = Node(5)
    tree.right?.right = Node(6)
}

fun buildSubtree() {
    subtree = Node(1)
    subtree.left = Node(2)
    subtree.right = Node(8)
}

fun isSubtree(tree: Node?, subtree: Node?) : Boolean {
    if (subtree == null) {
        return true
    }
    if (tree == null) {
        return false
    }

    if (tree.value == subtree.value) {
        if (isIdentical(tree, subtree)) {
            return true
        }
    }

    return isSubtree(tree.left, subtree) || isSubtree(tree.right, subtree)
}

fun isIdentical(tree: Node?, subtree: Node?) : Boolean{
    if (tree == null && subtree == null) {
        return true
    }
    if (tree == null || subtree == null) {
        return false
    }

    if (tree.value == subtree.value) {
        return isIdentical(tree.left, subtree.left) && isIdentical(tree.right, subtree.right)
    }
    return false
}
