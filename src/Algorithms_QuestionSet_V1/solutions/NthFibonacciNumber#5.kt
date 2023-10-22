package Algorithms_QuestionSet_V1.solutions

fun main(){

    val number = 5

    val position = number.nthFibonacci()
    if (position>=0){
        println("$number is ${number.nthFibonacci()} number of fibonacci series")
    }else{
        println("$number is not in fibonacci series")
    }

}

fun Int.nthFibonacci():Int{
    var currentNumber = 1
    var previousNumber = 0
    var currentNumberIndex = 0
    val numberToFind = this

    while (numberToFind>=currentNumber){
        currentNumberIndex++
        if (currentNumber==numberToFind){
            return currentNumberIndex
        }

        val nextNumber = currentNumber.plus(previousNumber)
        previousNumber = currentNumber
        currentNumber = nextNumber
    }

    return -1
}

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.