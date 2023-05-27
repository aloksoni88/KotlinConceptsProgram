

/*
*   FUNCTIONS as Expressions
* */
fun functionAsExpression() {

    var largeValue = max(4, 6)

    println("The greater number is $largeValue")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
