package Algorithms_QuestionSet_V1.solutions

fun main(){
    val array = listOf(1,1,1,2,3,4,3,2,2,3,4,4)
    println("Is frequency unique ${isFrequencyUnique(array)}")
}

fun isFrequencyUnique(array: List<Int>):Boolean {
    val hashMap = hashMapOf<Int,Int>()
    array.forEach {
        if (hashMap.contains(it)){
            hashMap[it] = hashMap.getValue(it).plus(1)
        }else{
            hashMap[it] = 1
        }
    }
    var prevKey = hashMap.values.first()
    println(hashMap)
    hashMap.values.forEach {
        if (it == prevKey){
            prevKey = it
        }else{
            return false
        }
    }

    return true
}