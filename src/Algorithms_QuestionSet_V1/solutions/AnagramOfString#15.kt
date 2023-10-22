package Algorithms_QuestionSet_V1.solutions

fun main(){

    val str1 = "bcadeh"
    val str2 = "hea"
    println("${remAnagram(str1,str2)} characters needs to be remove to make strings anagram.")
}

fun remAnagram(str1:String, str2: String):Int{
    var largeString = str1
    var smallerString = str2
    var anaCount = largeString.length
    if (str1.length<str2.length){
        largeString = str2
        smallerString = str1
    }

    smallerString.forEach {
        if (largeString.contains(it)){
            anaCount--
        }
        else{
            return -1 // Strings cannot be anagram
        }
    }

    return anaCount
}