package datastructure.tree.binarytree

import datastructure.tree.heightOfTree

class DiameterOfTree {

    //time complexity - O(n^2)
    fun diameterOfTree(root: Node?): Int {
        if (root == null) {
            return 0
        }
        val diameter1 = diameterOfTree(root?.left)
        val diameter2 = diameterOfTree(root?.right)

        val diameter3 = heightOfTree(root?.left) + heightOfTree(root?.right) + 1
        return Math.max(diameter3, Math.max(diameter1, diameter2))
    }

    inner class TreeInfo(ht: Int, dia: Int) {
        val height = ht
        val diameter = dia
    }

    fun diameterOfTreeOptimized(root: Node?): TreeInfo {
        if (root == null) {
            return TreeInfo(0, 0)
        }
        val leftInfo = diameterOfTreeOptimized(root?.left)
        val rightInfo = diameterOfTreeOptimized(root?.right)

        val height = Math.max(leftInfo.height, rightInfo.height) + 1

        val diameter1 = leftInfo.diameter
        val diameter2 = rightInfo.diameter
        val diameter3 = leftInfo.height + rightInfo.height + 1
        val diameter = Math.max(diameter3, Math.max(diameter1, diameter2))

        return TreeInfo(height, diameter)
    }
}

fun main() {
    val diameterOfTree = DiameterOfTree()
    val arr = intArrayOf(1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 8, 10, 15, -1, -1, -1, -1, -1)
    val root = buildBinaryTree(arr)
    printTreeWithInorderTraversal(root)
    println()
    printTreeWithPreorderTraversal(root)
    println()
    val height = diameterOfTree.diameterOfTreeOptimized(root).diameter
    println("Diameter of tree is $height")

}
