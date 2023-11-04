package Algorithms_QuestionSet_V1.solutions

fun main(){
    val str1 = "gksrek"
    val str2 = "geeksforgeeks"
    println("Is subsequence ${isSubsequence(str1, str2)}")

    val str3 = "AXY"
    val str4 = "YADXCP"
    println("Is subsequence ${isSubsequence(str3, str4)}")

}

fun isSubsequence(checkString:String, withString:String):Boolean {
    var str = ""
    var fromIndex = 0

    (withString.indices).forEach { index ->
        (fromIndex until checkString.length).forEach {
            if (checkString[fromIndex] == withString[index]){
                fromIndex++
                str = str.plus(withString[index])
            }
        }
    }

    return str==checkString
}