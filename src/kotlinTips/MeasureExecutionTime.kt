
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.time.*

@ExperimentalTime
fun main(){

    //measure time in  Duration
    val time:Duration = measureTime {
        doWork()
    }
    println(time)  //OP: 11.707500ms

    //measure time in millis
    val timeInMillis = measureTimeMillis {
        doWork()
    }
    println(timeInMillis)    // OP:1

    // measure time in nano
    val timeInNano = measureNanoTime {
        doWork()
    }
    println(timeInNano)     //OP: 1991000


    //returns time and value
    val timeAndValue:TimedValue<Any> = measureTimedValue {
        doWork()
    }
    println("Duration: ${timeAndValue.duration} Value:${timeAndValue.value}")   // OP: Duration: 1.732800ms Value:true

}

fun doWork():Boolean {
    (1..10000).forEach {
    }
    return true
}