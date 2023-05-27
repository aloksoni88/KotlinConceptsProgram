import kotlinx.coroutines.*

fun coroutineScope() = runBlocking {

    println("runBlocking: $this")

    launch {
        println("launch: $this")

        launch(coroutineContext) {
            println("child launch: $this")
        }
    }

    async {
        println("async: $this")
    }

    println("... some other code...")
}

fun main(){
    coroutineScope()
}