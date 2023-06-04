import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    GlobalScope.launch {
        val result = fakeNetwrokCall()
        val result2 = fakeNetwrokCall2()
        println("Network call answer1 : $result , Network call answer2 : $result2" )
    }

    Thread.sleep(3000)
    println("Main thread exit")
}

suspend fun fakeNetwrokCall(): String{
    delay(1000)
    return "network call answer"
}

suspend fun fakeNetwrokCall2(): String{
    delay(1000)
    return "network call answer2"
}