

/*
*   1. 'it' keyword
* */
fun itKeywordLambdas(args: Array<String>) {

    val program = Programs()
//    program.reverseAndDisplay("hello", { s -> s.reversed() })
    program.reverseAndDisplay("hello", { it.reversed() })
}

class Programs {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) {  // High Level Function with Lambda as Parameter

        val result = myFunc(str)    // it.reversed() ==> str.reversed() ==> "hello".reversed() = "olleh"
        println(result)
    }
}
