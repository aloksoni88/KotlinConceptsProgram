fun lambdasHighOrderFun1(){
    val obj = Multiplication()
    val mulValue = obj.getMultiplication(3,4)
    println(mulValue)

    var myLambda : (Int, Int) -> Int = { a: Int, b: Int -> (a * b)}
//    obj.getMulByHighLevelFunction(4,5, myLambda)
//    obj.getMulByHighLevelFunction(4,5, { a: Int, b: Int -> (a * b)})
    obj.getMulByHighLevelFunction(4,5, { a, b -> (a * b)})
}

class Multiplication{

    fun getMulByHighLevelFunction(a: Int, b: Int, action: (Int, Int) -> Int){
        val multiplication = action(a,b)
        println(multiplication)
    }

    fun getMultiplication(a: Int, b: Int): Int{
        val mul:Int = a * b
        return mul
    }
}