import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Main program starts: ${Thread.currentThread().name}")


    GlobalScope.launch { //creates background coroutines that runs in background thread
        println("Background thread starts: ${Thread.currentThread().name}")
        delay(2000L)
        println("Background thread ends: ${Thread.currentThread().name}")
    }


    Thread.sleep(3000L)
    println("Main program ends: ${Thread.currentThread().name}")
}