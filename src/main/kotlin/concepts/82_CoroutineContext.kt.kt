import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    //Do in the UI thread
//    GlobalScope.launch(Dispatchers.Main) {
//        val result = doNetworkCall()
//        println("Result of network call, Dispatchers.Main: $result")
//        println("Current thread : ${Thread.currentThread().name}")
//    }

    //Network operations
    GlobalScope.launch(Dispatchers.IO) {
        val result = doNetworkCall()
        println("Result of network call, Dispatchers.IO: $result")
        println("Current thread : ${Thread.currentThread().name}")
    }

    //
    GlobalScope.launch(Dispatchers.Default) {
        val result = doNetworkCall()
        println("Result of network call, Dispatchers.Default: $result")
        println("Current thread : ${Thread.currentThread().name}")
    }

    GlobalScope.launch(Dispatchers.Unconfined) {
        val result = doNetworkCall()
        println("Result of network call, Dispatchers.Unconfined: $result")
        println("Current thread : ${Thread.currentThread().name}")
    }

    Thread.sleep(2000)
}

suspend fun doNetworkCall():String{
    delay(1000L)
    return "network call result"
}