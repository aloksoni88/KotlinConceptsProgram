
@file:JvmName("MyCustomKotlinFile")
fun myKotlinInteroperability2(){
    val sum = MyJavaFile2.add(4,5);
    println("Sum of the given number is $sum")
}

fun getArea(a: Int, b: Int): Int{
    return (a*b)
}
@JvmOverloads
fun getVolume(length: Int, breath: Int, height: Int=10): Int {
    return length * breath * height;
}