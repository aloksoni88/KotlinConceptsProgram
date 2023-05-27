import java.util.Stack

fun main() {
    val result = stringReverseWord("my name is alok")
    println(result)
}

fun stringReverseWord(str: String) : String{
    val strVal = str.split(" ")
    var stk = Stack<String>()
    for (i in 0..strVal.size-1){
        stk.push(strVal[i])
    }
    var resultStr: String = ""
    for(i in 0..stk.size-1){
        resultStr = resultStr + stk.pop() + " "
    }
    return resultStr;
}