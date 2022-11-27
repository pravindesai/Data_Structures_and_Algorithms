import java.lang.Exception
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.coroutineContext
import kotlin.coroutines.suspendCoroutine
import kotlin.coroutines.*


fun main() {

Custom(123).checkType()

}

class Custom<T>(val v:T){
    fun checkType(){
        println(v)
    }
}