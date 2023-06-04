package com.algoexpert.easy

class BranchSum {

    inner class BinaryTree(val data: Int) {
        var value: Int = data
        var left: BinaryTree? = null
        var right: BinaryTree? = null
    }
}

fun getBranchSum(tree:BranchSum.BinaryTree?): ArrayList<Int> {
    var list: ArrayList<Int> = ArrayList()
    getBranchSum(tree, 0, list)
    return list
}

fun getBranchSum(tree: BranchSum.BinaryTree?, sum: Int, list: ArrayList<Int>) {
    if (tree == null) {
        return
    }
    val newSum: Int = sum + tree.value
    if (tree.left == null && tree.right == null){
        list.add(newSum)
    }
    getBranchSum(tree.left, newSum, list)
    getBranchSum(tree.right, newSum, list)
}
fun main() {
    val branchSum = BranchSum()
    val tree: BranchSum.BinaryTree = branchSum.BinaryTree(1)
    tree.left = branchSum.BinaryTree(2)
    tree.right = branchSum.BinaryTree(3);

    tree.left!!.left = branchSum.BinaryTree(4)
    tree.left!!.right = branchSum.BinaryTree(5);
    tree.right!!.left = branchSum.BinaryTree(6)
    tree.right!!.right = branchSum.BinaryTree(7)

    tree.left!!.left!!.left = branchSum.BinaryTree(8);
    tree.left!!.left!!.right = branchSum.BinaryTree(9);
    tree.left!!.right!!.left = branchSum.BinaryTree(10);

    val list: ArrayList<Int> = getBranchSum(tree)
    println(list)
}