package Algorithms_QuestionSet_V1.solutions

import java.util.ArrayList
import java.util.Stack

fun main(){

    val num1 = 555
    println("Is $num1 palindrome = ${num1.isPalindrome()}")

    val num2 = 123
    println("Is $num2 palindrome = ${num2.isPalindrome()}")

}

fun Int.isPalindrome():Boolean{
    val separateNumbersArray = ArrayList<Int>()
    var number = this

    //Separate out the integers from number to check
    while (number>0){
        val lastDigit = number % 10
        number = number /10
        separateNumbersArray.add(0,lastDigit)
    }
    println(separateNumbersArray)

    //check if it is palindrome
    var startIndex = 0
    var endIndex = separateNumbersArray.size.minus(1)

    (0..endIndex).forEach {
        if (separateNumbersArray[startIndex] != separateNumbersArray[endIndex]){
            return false
        }
        startIndex++
        endIndex--
    }

    return true
}