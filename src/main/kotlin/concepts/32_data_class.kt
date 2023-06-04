
/*
*   Data Class
* */
fun dataClass() {

    var user1 = User("Sam", 10)

    var user2 = User("Sam", 10)

    println("${user1} && ${user2}")

    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")

    var newUser = user1.copy()

    println(user1.equals(newUser))
//    println(newUser)
}

fun main() {
    dataClass()
}

data class User(val name: String, var id: Int) { //datq class you must have propery or field variables in primary constructor
    val age:Int = 34
}
