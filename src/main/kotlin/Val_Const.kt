class Val_Const {
    companion object{
        const val IMAGE_EXTENSION =  ".jpg" ;
        //const val timeWithConst = "${System.currentTimeMillis()}_.jpg" //compiler error: const val initializer should be constant value
        val time = "${System.currentTimeMillis()}_.jpg"
        val fileName :String
            get() = "TestFileName_" + System.currentTimeMillis() + IMAGE_EXTENSION
    }
}

fun main() {
    println(Val_Const.time)
    println(Val_Const.fileName)

    val obj1 = Val_Const()
    val obj2 = Val_Const()
    val obj3 = obj1

    println("Object 1 = $obj1 & Object 2 = $obj2 & Object 3 = $obj3")
    println(obj1 == obj2)
    println(obj1 === obj2)
    println(obj1 == obj3)
    println(obj1 === obj3)
}