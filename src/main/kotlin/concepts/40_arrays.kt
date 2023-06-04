
/*
*   1. Arrays
* */
fun arrays() {

    // Elements :   32  0   0   54  0
    // Index    :   0   1   2   3   4

    var myArray = Array<Int>(5) { 0 }   // Mutable. Fixed Size.
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    val intArr = intArrayOf(1,4,6,7,9,1)
    val charArr = charArrayOf('a', 'e')
    val floatArr = floatArrayOf(1.2f, 4.5f)
    val doubleArr = doubleArrayOf()
    val intArrNull = arrayOfNulls<String>(5)
    val IntArr = IntArray(6){i -> i * i}
    for (element in myArray) {              // Using individual elements (Objects)
        println(element)
    }

    println()

    for (index in 0 .. myArray.size - 1) {
        println(myArray[index])
    }
    println("===========")
    println("${intArr.size} ${intArr.get(4)} ")
    println("${intArrNull.size}  ${intArrNull.get(1)}")
    println("${IntArr.size}  ${IntArr.get(2)}")
}

fun main() {
    arrays()
}
