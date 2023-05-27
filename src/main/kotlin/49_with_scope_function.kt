class Person2 {
    var name: String = "Sriyank Siddhartha"
    var age: Int = 26
}

fun withScopeFunction() {

    /** Scope Function: 'with'
        Property 1: Refer to context object by using 'this'
        Property 2: The return value is the 'lambda result'  */

    val person = Person2()

    val bio:String = with(person) {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way" // will be returned and stored in 'bio' String variable
    }

//    println("Age after five years is $ageAfterFiveYears")
    println(bio)
}