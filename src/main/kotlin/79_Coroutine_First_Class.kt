import kotlinx.coroutines.*
import kotlin.concurrent.thread

fun main(){

    println("Main program starts: ${Thread.currentThread().name}")

//    thread { //creates background thread and run in different block
//        println("Background thread starts: ${Thread.currentThread().name}")
//        Thread.sleep(2000L)
//        println("Background thread ends: ${Thread.currentThread().name}")
//    }

    GlobalScope.launch { //creates background coroutines that runs in background thread
        println("Background thread starts: ${Thread.currentThread().name}")
        Thread.sleep(2000L)
        println("Background thread ends: ${Thread.currentThread().name}")
    }
    Thread.sleep(3000L)
    println("Main program ends: ${Thread.currentThread().name}")
}
