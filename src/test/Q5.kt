
/*
Question 5:
Given the same input as above, place parentheses around the vowels.
For example:
["d(o)g", "c(a)t", "m(ou)s(e)", "sky", "(e)l(e)v(e)n"]
Notice how consecutive vowels are grouped. That is, "m(ou)s(e)" is correct; "m(o)(u)s(e)" is
incorrect.
 */

fun main(){
    val vowels = arrayListOf("a", "e", "i", "o", "u")
    val array = arrayOf("dog", "cat", "mouse", "sky", "eleven")
    val resArray = mutableListOf<String>()

    array.forEachIndexed { index, s ->
        var str = ""
        var vGroup = ""

        s.forEachIndexed{ _, character ->

            if (vowels.contains(character.toString())){
                vGroup += character
            }else {
                if (vGroup.isEmpty()){
                    str += character
                }else{
                    str += "($vGroup)$character"
                    vGroup = ""
                }
            }
        }
        resArray.add(str)

    }
    println(resArray)

}