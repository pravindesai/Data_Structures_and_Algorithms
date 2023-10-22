package Algorithms_QuestionSet_V1.solutions

fun main(){
    val string1 = "aeioup"
    val string2 = "bcdaeiou"
    val string3 = "abgggggggggg"

    println("$string1 is ${isGoodOrBad(string1)}")
    println("$string2 is ${isGoodOrBad(string2)}")
    println("$string3 is ${isGoodOrBad(string3)}")

}

fun isGoodOrBad(string: String):String{
    val vowels = listOf('a','e','i','o','u')
    var isBroke = false
    var counter = 0
    var isCheckingVowels = true
    for (itr in string.indices) {

        when{
            vowels.contains(string[itr]) && isCheckingVowels.not() ->{
                counter = 0
                isCheckingVowels = true
            }
            vowels.contains(string[itr]).not() && isCheckingVowels ->{
                isCheckingVowels = false
                counter = 0
            }
            vowels.contains(string[itr]) && isCheckingVowels ->{
                counter++
            }
            vowels.contains(string[itr]).not() && isCheckingVowels.not() ->{
                isCheckingVowels = false
                counter++
            }
        }

        when{
            isCheckingVowels && counter>=5 -> {
                isBroke = true
                break
            }
            isCheckingVowels.not() && counter>=7 ->{
                isBroke = true
                break
            }
        }

    }

    return if (isBroke) "BAD" else "GOOD"
}


//If there are more than 3 consonants together or more than 5 vowels together, the String is
//considered to be "BAD"