package kotlinTips

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
fun main(){
    val list= (1..10000)
    val sequence = sequence{
        list.forEach {
            yield(it)
        }
    }

    val timeForMappingOfList = measureTime {
                list
                .filter { it % 2 == 0 }
                .map { it * it }
                .map { it/it }
    }
    println(timeForMappingOfList) //OP:17.500900ms

    val timeForMappingOfSequence = measureTime {
                sequence
                .filter{ it % 2 == 0 }
                .map{ it * it }
                .map { it/it }

    }

    println(timeForMappingOfSequence) //OP:3.969500ms

}