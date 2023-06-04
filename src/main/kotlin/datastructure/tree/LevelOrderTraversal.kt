package datastructure.tree

import java.util.LinkedList
import java.util.Queue

val queue: Queue<Node> = LinkedList<Node>()
fun main() {
    val arr = intArrayOf(1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1)
    val root = buildBinaryTree2(arr)
    levelOrderTraversal(root)
}

fun buildBinaryTree2(arr: IntArray) : Node?{
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

fun levelOrderTraversal(root: Node?) {
    if (root == null) {
        return
    }
    queue.add(root)
    queue.add(null)
    println(queue)
    while(!queue.isEmpty()) {
        val currentNode = queue.poll()
        if (currentNode == null) {
            println()
            if(queue.isEmpty()){
                break
            }else{
                queue.add(null)
            }
        } else {
            print("${currentNode.value}  ")
            currentNode.left?.let { queue.add(currentNode.left) }
            currentNode.right?.let { queue.add(currentNode.right) }
        }
    }
}
