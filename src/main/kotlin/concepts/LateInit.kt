open class LateInit {
    lateinit var lateinitVar : String

    val pi by lazy {
        3.14f
    }

    val sqrt = lazy {
        1.414f
    }

}

fun main() {
    println("lateinit example")
    val lateInitObj = LateInit()
    //lateInitObj.lateinitVar = "test"
    println(lateInitObj.pi)
    println(lateInitObj.sqrt.isInitialized())
    println(lateInitObj.lateinitVar)
}