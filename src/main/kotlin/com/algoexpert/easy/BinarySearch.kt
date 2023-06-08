package com.algoexpert.easy

fun main() {
    val arr  = intArrayOf(1,3,4,6,8,9,10,14,16)
    val itemToSearch = 9
    val searchResult = binarySearch(arr, itemToSearch)
    when(searchResult) {
        -1 -> print("Item not found")
        else -> print("Item found at index : $searchResult")
    }
}

fun binarySearch(arr: IntArray?, searchItem: Int) : Int {
    if(arr == null) {
        return -1
    }
    var low = 0
    var high = arr.size-1

    while( low <= high ) {
        val mid = (low+high)/2
        if (arr[mid] == searchItem) {
            return mid
        } else if (arr[mid] > searchItem) {
            high = mid -1
        } else {
            low = mid+1
        }
    }
    return -1
}