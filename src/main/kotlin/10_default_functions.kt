
/*
*   Default Functions
* */
fun defaultFunction() {

    var result = findVolume(2, 3)
    print(result)
}

fun findVolume(length: Int, breadth: Int, height: Int = 10): Int {

    return length * breadth * height
}
