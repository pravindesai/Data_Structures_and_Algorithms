package Algorithms_QuestionSet_V1.solutions

fun main(){
    val str = "BCDEB"
    println("Add ${addMinChar(str)} characters to make string palindrome.") // 4

    val str2 = "ABA"
    println("Add ${addMinChar(str2)} characters to make string palindrome.") // 0

    val str3 = "ABCD"
    println("Add ${addMinChar(str3)} characters to make string palindrome.") // 3


}

fun addMinChar(string: String):Int{
    var count = 0
    var startIndex = 0
    var endIndex = string.length-1

        while (startIndex<endIndex){
            when{
                ((string[startIndex] != string[endIndex]) ) ->{
                    count++
                    endIndex--
                }
                else ->{
                    startIndex++
                    endIndex --
                }

            }
        }

    return count
}



//Given a string str, find the minimum characters to be added at front of the string to make it
//a palindrome.