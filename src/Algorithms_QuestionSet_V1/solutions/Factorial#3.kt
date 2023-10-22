package Algorithms_QuestionSet_V1.solutions

import java.util.ArrayList

fun main(){
    val number  = 4

    println("Factorial of $number is ${number.factorial()}")
}

fun Int.factorial():Int{
    var factorial = 1
    (1..this).forEach {
        factorial = factorial.times(it)
    }

    return factorial
}