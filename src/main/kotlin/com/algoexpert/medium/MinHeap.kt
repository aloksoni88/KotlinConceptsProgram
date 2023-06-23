package com.algoexpert.medium

lateinit var heap: ArrayList<Int>

fun main() {
    val arr = intArrayOf(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41)
    //val arr = intArrayOf(10,17,15,24,45,46,54,29,39)

    val length = arr.size-1
    for (i in (length/2-1)downTo 0) {
        heapify(arr, length, i)
    }

    println("After heapify the arrays are")
    println(arr.toList())

    println("Heap sort")
    heapSort(arr)
    println(arr.toList())


    heap = buildMinHeap(arr)
    println(heap)

    println("Insert item : 76")
    println("heap after inserting 76")
    insert(76)
    println(heap)

    println("peek ${peek()}")

    remove(-5)
    println("after delteing item ")
    println(heap)

    println("After remove")
    remove()
    println(heap)
    remove()
    println(heap)
    remove()
    println(heap)
    remove()
    println(heap)
    remove()
    println(heap)



}

fun buildMinHeap(arr: IntArray): ArrayList<Int> {
    var list = ArrayList<Int>()
    for (i in 0..arr.size - 1) {
        list = buildMinHeap(arr[i], list)
    }
    return list
}

fun buildMinHeap(item: Int, list: ArrayList<Int>): ArrayList<Int> {
    if (list.isEmpty()) {
        list.add(item)
        return list
    }
    list.add(item)
    var index = list.size - 1
    while (index > 0) {
        val rootIndex = (index - 1) / 2
        if (list.get(index) < list.get(rootIndex)) {
            swap(index, rootIndex, list)
            index = rootIndex
        } else {
            break
        }
    }
    return list
}

fun swap(a: Int, b: Int, list: ArrayList<Int>): ArrayList<Int> {
    val tmp = list.get(a)
    list.set(a, list.get(b))
    list.set(b, tmp)
    return list
}

fun insert(item: Int) {
    heap = buildMinHeap(item, heap)
}

fun peek(): Int {
    if (heap.isEmpty()) {
        return -1
    }
    return heap[0]
}

fun remove() {
    if (heap.isEmpty()) {
        println("No item to remove")
        return
    }
    val lastItem = heap.removeAt(heap.size - 1)
    heap.set(0, lastItem)
    val size = heap.size - 1
    var rootIndex = 0
    while (rootIndex < size / 2) {
        val left = 2 * rootIndex + 1
        val right = 2 * rootIndex + 2

        if (right > size) {
            if (heap.get(rootIndex) > heap.get(left)) {
                heap = swap(left, rootIndex, heap)
            }
            break
        } else if (heap.get(left) < heap.get(right) && heap.get(rootIndex) > heap.get(left)) {
            heap = swap(left, rootIndex, heap)
            rootIndex = left
        } else if (heap.get(rootIndex) > heap.get(right)) {
            heap = swap(right, rootIndex, heap)
            rootIndex = right
        } else {
            break
        }

//        if (left <= size && heap.get(rootIndex) > heap.get(left)) {
//            heap = swap(rootIndex, left, heap)
//            rootIndex = left
//        }
//        if (right <= size && heap.get(rootIndex) > heap.get(right)) {
//            heap = swap(rootIndex, right, heap)
//            rootIndex = right
//        } else {
//            break
//        }
    }
}

fun remove(item: Int) {
    if (heap.isEmpty()) {
        println("No item found, heap is empty")
        return
    }
    var itemIndex = -1
    val n = heap.size - 1
    for (i in 0..n) {
        if (item == heap.get(i)) {
            itemIndex = i
        }
    }
    if (itemIndex == -1) {
        println("Item not found")
        return
    }

    val lastItem = heap.removeAt(n)
    heap.set(itemIndex, lastItem)
    var index = itemIndex
    while (index > 0) {
        val rootIndex = (index - 1) / 2
        if (heap.get(rootIndex) > heap.get(index)) {
            heap = swap(index, rootIndex, heap)
            index = rootIndex
        } else {
            break
        }
    }

    while (index < n / 2) {
        val left = 2 * index + 1
        val right = 2 * index + 2

        if (right >= n) {
            if (heap.get(left) < heap.get(index)) {
                heap = swap(left, index, heap)
            }
            break
        } else if (heap.get(left) < heap.get(right) && heap.get(left) < heap.get(index)) {
            heap = swap(left, index, heap)
            index = left;
        } else if (heap.get(right) < heap.get(index)) {
            heap = swap(right, index, heap)
            index = right
        } else {
            break
        }
    }
}

fun heapify(arr: IntArray, n: Int, index: Int) {
    var smallest = index
    val left = 2 * smallest + 1
    val right = 2 * smallest + 2

    if (left < n && arr[smallest] > arr[left]) {
        smallest = left
    }
    if (right < n && arr[smallest] > arr[right]) {
        smallest = right
    }

    if (smallest != index) {
        val tmp = arr[smallest]
        arr[smallest] = arr[index]
        arr[index] = tmp
        heapify(arr, n, smallest)
    }
}

fun heapSort(arr: IntArray?){
    if (arr == null || arr.size == 0) {
        return
    }
    val length = arr.size-1
    for (i in (length/2)-1 downTo 0) {
        heapify(arr, length, i)
    }

    for (i in length downTo 0) {
        val tmp = arr[i]
        arr[i] = arr[0]
        arr[0] = tmp
        heapify(arr, i, 0)
    }
}
