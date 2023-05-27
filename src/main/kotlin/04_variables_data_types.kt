
/*
* This is main function. Entry point of the application.
* */
fun variablesNDataTypes() {

    var myNumber = 10       // Int
    var myDecimal = 1.0     // Float
    var isActive = true     // Boolean

    var myString: String    // Mutable String
    myString = "Hello World"
    myString = "Another World"

    val myAnotherString = "My constant string value"    // Immutable String
//    myAnotherString = "some value"  // NOT ALLOWED, since it is immutable

    var str  = String()
    str = "My constant string value"

    println(myNumber)
    println(myDecimal)
    println(isActive)
    println(myString)
    println(myAnotherString)

    println("my string =  ${str}")
    println(str == myAnotherString)
}
