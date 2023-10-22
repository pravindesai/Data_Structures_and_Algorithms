package Algorithms_QuestionSet_V1.solutions

import kotlin.math.absoluteValue

fun main(){

    val actualAmount = 99
    val pappusAmount = actualAmount.pappusAmont()
    val maxDiff = actualAmount.findDiffByPappu(pappusAmount)

    println("maximum possible extra amount = $pappusAmount - $actualAmount = $maxDiff")

}

fun Int.findDiffByPappu(pappusAmount: Int):Int{
    return this.minus(pappusAmount).absoluteValue
}

fun Int.pappusAmont():Int{

    val str = this.toString()
    var newString = ""

    str.forEach { c ->
        newString = when(c){
            '9'->{
                newString.plus(6)
            }
            '6'->{
                newString.plus(9)
            }
            else->{
                newString.plus(c)
            }
        }
    }
    return newString.toInt()
}


//maximum possible extra amount = 59 - 56 = 3
//maximum possible extra amount = 99 - 66 = 33.