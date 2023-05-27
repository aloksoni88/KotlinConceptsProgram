fun isPalindorme(str: String) : Boolean {
    val len = str.length
    for (i in 0..len/2) {
        if(!str[i].equals(str[len-i-1])) {
            return false
        }
    }
    return true
}

fun main() {
    val result = isPalindorme("kaka1kak")
    println("Result is = $result")
}