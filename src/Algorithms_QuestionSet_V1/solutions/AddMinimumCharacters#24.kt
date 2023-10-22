package Algorithms_QuestionSet_V1.solutions

fun main(){
    val str = "BABCDE"

    println("Add ${addMinChar(str)} characters to make string palindrome.")
}

fun addMinChar(string: String):Int{
    var count = 0
    val startIndex = 0
    var endIndex = string.length-1

    (string.indices).forEach { _ ->
        if ((string[startIndex] != string[endIndex]) && startIndex != endIndex){
            count++
            endIndex--
        }
    }

    return count
}



//Given a string str, find the minimum characters to be added at front of the string to make it
//a palindrome.