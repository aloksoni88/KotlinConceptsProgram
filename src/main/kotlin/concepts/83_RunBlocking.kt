import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        println("run blocking")
        delay(1000)
    }
}