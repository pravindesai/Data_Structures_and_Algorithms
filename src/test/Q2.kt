/*
Question 2:
Given an array of string, such as
["A", "B", "C", "Z", "Q"]
return an object such as
{ "A": 0, "B": 1, "C": 2, "Z" : 3, "Q": 4 }
The numbers here are the positions of the string in the input array.
*/


fun main(){
    val array = arrayOf("A", "B", "C", "Z", "Q")
    val hashMap = hashMapOf<String, Int>()

    array.forEachIndexed { index, s ->
        hashMap.put(s, index)
    }

    println(hashMap)
}