package Algorithms_QuestionSet_V1.solutions

import kotlinx.coroutines.*

fun main(): Unit = runBlocking{

    val coroutineExceptionHandler = CoroutineExceptionHandler(){ coroutineContext, throwable ->
        println("EXCEPTION CAUGHT $throwable")
    }
    try {
        print("RUNNING ")

        val j1 = CoroutineScope(coroutineExceptionHandler).launch {
            throw NullPointerException("NULL")
        }

        val j2 = CoroutineScope(coroutineExceptionHandler).async {
            throw NullPointerException("NULL2")
        }

        j1.join()
        j2.await()


    }catch (e:Exception){
        print("${e.message}")
    }


}