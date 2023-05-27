

/*
* WHEN as Expression
* */
fun whenExpression() {

    val x = 10

    val str: String  = when (x) {

        0,1 -> "x is 0 or 1"
        2 -> "x is 2"
        else -> {
            "x value is unknown"
            "x is ${x}"
        }
    }

    println(str)

    val y: Int = 100
    val range  = 0..100
    var s: String = when(y){
        0,1,2,3,4-> "value is in between of 0 to 100"
        100 -> "value is 100"
        else -> "x is greater than 100"
    }
    println(s)
}
