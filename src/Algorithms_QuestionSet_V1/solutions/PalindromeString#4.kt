package Algorithms_QuestionSet_V1.solutions

fun main(){

    val text1 = "abccba"
    val text2 = "abc"

    println("Is $text1 palindrome = ${text1.isPalindrome()}")
    println("Is $text2 palindrome = ${text2.isPalindrome()}")

}

fun String.isPalindrome():Boolean{

    var startIndex = 0
    var endIndex = this.length.minus(1)

    (0..endIndex).forEach {
        if (this[startIndex]!=this[endIndex]){
            return false
        }
        startIndex++
        endIndex--
    }

    return true
}