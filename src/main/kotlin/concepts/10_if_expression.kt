
/*
* IF as Expression
* */
fun ifExpression() {

    val a = 2

    val b = 5

    var maxValue = if (a > b) {
                            print("a is greater")
                            a
                        } else {
                            print("b = ${b} is greater, ")
                            b
                        }

    println(maxValue)

    val max = if(a > b) a else b

    println(max)
}
