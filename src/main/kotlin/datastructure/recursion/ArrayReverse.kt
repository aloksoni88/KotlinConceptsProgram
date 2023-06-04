package datastructure

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val result = reverseArray(arr)
    println("Reversed array is ${result.asList()}")
}

fun reverseArray(arr: IntArray) : IntArray{
    reverseArrayUsingRecurssion(0, arr)
    return arr
}

fun reverseArrayUsingRecurssion(left: Int,  arr: IntArray) : IntArray {
    if (left >= arr.size/2) {
        return arr
    }
    swapIndex(left, arr.size - left - 1, arr)
    reverseArrayUsingRecurssion(left+1, arr)
    return arr
}

fun swapIndex(left: Int, right: Int, arr: IntArray) {
    val tmp = arr[right]
    arr[right] = arr[left]
    arr[left] = tmp
}
