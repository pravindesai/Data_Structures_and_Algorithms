package kotlinTips

import kotlinTips.Counter.count
import kotlinx.coroutines.*

object Counter{
    var count = 0
}
fun main()= runBlocking{
        log(0,Thread.currentThread().name)

            CoroutineScope(Dispatchers.IO).launch{
                log(1,Thread.currentThread().name)
            }

        log(2,Thread.currentThread().name)

        val result = async {
            withContext(Dispatchers.Default) {
                log(3,"WAITING  ${Thread.currentThread().name}")
                Thread.sleep(5000)
            }
            "OK  ${Thread.currentThread().name}"
        }

    log(4,result.await())
    log(5,Thread.currentThread().name)


}

fun log(position:Int, s:String){
    println("$count  Pos $position-->  $s")
    count++
}