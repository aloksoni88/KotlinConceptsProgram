package concepts
private class Persson (var name : String = "no assigned", val id: Int ) {
    var rollNumber: Int  = 1;
    constructor(  rNumber: Int) : this("alok", 0) {
        this.rollNumber = rNumber
    }
    init {
        println("this init block is executed $name & $id")
        name = "atul"
        println("roll number is = $rollNumber")
    }
     fun display() {
        print("The name of the person is ${name} & $rollNumber")
    }

}

fun main() {
    val person = Persson(100)
    println(person.name)
    println(person.display())

}
