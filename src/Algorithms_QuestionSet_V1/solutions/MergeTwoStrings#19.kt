package Algorithms_QuestionSet_V1.solutions

fun main(){
    val str1 = "ABCDEFGHI"
    val str2 = "1234"
    println("Merged String is ${merge(str1, str2)}")

}

fun merge(str1: String, str2: String): String {
    var mergedString = ""
    val totalLength = if (str1.length>str2.length) str1.length else str2.length
    var index = 0
    (0..totalLength).forEach { itr ->
        val addToString =
            when{
                index<str1.length && index<str2.length ->{
                    val s = "${str1[index]}${str2[index]}"
                    index++
                    s
                }
                index<str1.length && index >=str2.length ->{
                    val s = "${str1[index]}"
                    index++
                    s
                }
                index>=str1.length && index < str2.length ->{
                    val s = "${str2[index]}"
                    index++
                    s
                }
                else -> {
                    ""
                }
            }
        mergedString = mergedString.plus(addToString)
    }
    return mergedString
}
