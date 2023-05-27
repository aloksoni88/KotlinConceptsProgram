val lambda = {a: Int, b: Int-> a + b}

fun higherOrderFunction(lmbda: (Int, Int) -> Int) {
    val result = lmbda(2, 5)
    println("result is = $result")
}

fun mul(a: Int, b: Int) : Int {
    return a * b;
}

fun highOrderFuncMul() : ((Int, Int) -> Int) {
    return ::mul
}

fun main() {
    higherOrderFunction(lambda)
    val multifyFun = highOrderFuncMul()
    val result = multifyFun(5,6)
    println("result of multiplication is = $result")
}