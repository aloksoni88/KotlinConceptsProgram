
/*
 *   Interoperability Example
 * */
fun myKotlinInteroperability() {

    var area = MyJavaFile.getArea(10, 5)
    println("Printing area from Kotlin file: $area")
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}
