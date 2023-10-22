package Algorithms_QuestionSet_V1.solutions

fun main(){
    val n = 5
    println("Fibonacci till $n is \n${n.Series().joinToString(",")}")
}

fun Int.Series():List<Int>{
    var currentNumber = 1
    var previousNumber = 0
    val seriesTillNumber = this
    val series = arrayListOf<Int>()
    series.add(previousNumber)

    while (seriesTillNumber>=currentNumber){
        series.add(currentNumber)
        val nextNumber = currentNumber.plus(previousNumber)
        previousNumber = currentNumber
        currentNumber = nextNumber
        if (currentNumber>seriesTillNumber){
            break
        }
    }

    return series
}