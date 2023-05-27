

/*
* This is main function. Entry point of the application.
* */
fun kotlinBasics() {

    var personObj = Person()
    personObj.name = "Steve"

    println("The name of the person is ${personObj.name}")
    println("person object = " + personObj.myName)
}

class Person : Super(){

    var name: String = ""
    override var myName: String = "abc"
        get() = field
        set(value) {
            field = value
        }

}

open class Super  {
    open var myName: String = "alok"
}