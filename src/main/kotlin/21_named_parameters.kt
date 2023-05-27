

/*
*   Named Parameters
* */
fun namedParameter() {

    var result = findTheVolume (length =3,breadth = 2)
    print(result)
}

fun findTheVolume(length: Int, height: Int = 10, breadth: Int): Int {
    println("length is $length")
    println("breadth is $breadth")
    println("height is $height")
    return length * breadth * height
}

fun main() {
    namedParameter()
}
