package com.algoexpert.medium


fun main() {
    val arr = intArrayOf(1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3)
    val result = getLongestPeak(arr)
    println("Peak List : ${result.asList()}")
    println("Peak count is ${result.size}")
}

fun getLongestPeak(arr: IntArray): IntArray {
    var list = ArrayList<Int>()
    for (i in 1..arr.size - 2) {
        if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            list = getPeakList(i, arr)
        }
    }
    return list.toIntArray()
}

fun getPeakList(index: Int, arr: IntArray): ArrayList<Int> {
    var start = index - 1;
    var end = index + 1
    val peakList = ArrayList<Int>()
    while (start >= 0 && end < arr.size - 1) {
        if (start != 0 && arr[start] > arr[start-1]) {
            start--
        } else if (end != arr.size-1 && arr[end] > arr[end+1]) {
            end++
        } else {
            break
        }
    }
    for (i in start..end) {
        print("${arr[i]} ")
        peakList.add(arr[i])
    }
    println()
    return peakList
}
