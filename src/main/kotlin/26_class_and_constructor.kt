
/*
*   Class, Primary Constructor, Secondary Constructor and Init Block
* */
fun classAndConstructors() {

    var student = Student("Alok", 10)

    student.name = "Atul"
    println("${student.id} & ${student.name}")

    val teacher = Teacher("Maths","English")
    println("Subjects are ${teacher.subject1} & ${teacher.subject2}")

    val myClass = MyClass()
}

class Student( var name: String= "aldjkf") {

    var id: Int = -1

    init {
        println("Student has got a name as $name and id is $id")
    }

    constructor( n: String, id: Int): this(n) {
        // The body of the secondary constructor is called after init block
        this.id = id
    }
}

class Teacher{
    var subject1 =""
    var subject2 =""
    constructor(subject1: String, subject2: String){
        this.subject1 = subject1
        this.subject2 = subject2
    }
}

class MyClass{
    init {
        testParam = "some string"
        showTestParam()
    }
    init {
        testParam = "new string"
    }
    val testParam: String = "after"
    constructor(){
        println("in constructor testParam = $testParam")
    }
    fun showTestParam(){
        println("in showTestParam testParam = $testParam")
    }
}
