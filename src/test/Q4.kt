
/*
Question 4:
Given an array of words, pick out only those words that have two or
more vowels in them. For the purposes of this question, a vowel is one
of the letters a, e, i, o, u.
For example, given
["dog", "cat", "mouse", "sky", "eleven"]

return

["mouse", "eleven"]
*/

fun main(){
    val vowels = arrayListOf("a", "e", "i", "o", "u")
    val array = arrayOf("dog", "cat", "mouse", "sky", "eleven")
    val resArray = mutableListOf<String>()

    array.forEachIndexed { index, s ->
        var vowelCount = 0

        s.forEach{ c ->
            if (vowels.contains(c.toString())) vowelCount++
        }

        if (vowelCount>=2){
            resArray.add(s)
        }
    }

    println(resArray)
}