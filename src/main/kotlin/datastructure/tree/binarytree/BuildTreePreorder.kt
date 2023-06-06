package datastructure.tree.binarytree

var index: Int = -1
fun main() {
    val arr = intArrayOf(1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1)
    val root : Node? = buildBinaryTree(arr)
    println("root node of trdee is ${root?.value}")
    println("Tree in preorder traversal")
    println(printTreeWithPreorderTraversal(root))
    println("Tree in Inorder traversal")
    println(printTreeWithInorderTraversal(root))
    println("Tree in Postorder traversal")
    println(printTreeWithPostorderTraversal(root))
}

 class Node(data: Int) {
     var value = data
     var left: Node? = null
     var right: Node? = null

     constructor(data : Int, left: Node, right: Node) : this(data) {
         this.value = data
         this.left = left
         this.right = right
     }
}

fun buildBinaryTree(arr: IntArray) : Node?{
    index++
    if (arr[index] == -1) {
        return null
    } else{
        val node = Node(arr[index])
        node.left = buildBinaryTree(arr)
        node.right = buildBinaryTree(arr)
        return node
    }
}

fun printTreeWithPreorderTraversal(root: Node?){
    if (root == null ){
        return
    }
    print("${root.value} ")
    printTreeWithPreorderTraversal(root.left)
    printTreeWithPreorderTraversal(root.right)
}

fun printTreeWithInorderTraversal(root: Node?){
    if (root == null ){
        return
    }
    printTreeWithInorderTraversal(root.left)
    print("${root.value} ")
    printTreeWithInorderTraversal(root.right)
}

fun printTreeWithPostorderTraversal(root: Node?){
    if (root == null ){
        return
    }
    printTreeWithPostorderTraversal(root.left)
    printTreeWithPostorderTraversal(root.right)
    print("${root.value} ")
}


