package datastructure

fun main() {
    val str = "abccba"
    println(isStringPalindrom(str))
}

fun isStringPalindrom(str: String) : Boolean {
    return isStringPalindromUsingRecusion(0, str)
}

fun isStringPalindromUsingRecusion(left: Int, str: String): Boolean{
    if (left >= str.length) {
        return true
    }
    if (!str[left].equals(str[str.length-1-left])) {
        return false
    }
    return isStringPalindromUsingRecusion(left+1, str)
}