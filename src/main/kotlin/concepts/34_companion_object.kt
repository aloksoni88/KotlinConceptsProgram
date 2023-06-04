
/*
*   1. Companion Object
* */
fun companianObject() {

    MyCompanionClassTest.count           // You can print it and check result

    MyCompanionClassTest.typeOfCustomers()
}

class MyCompanionClassTest {

    companion object {

        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Indian"
        }
    }
}
