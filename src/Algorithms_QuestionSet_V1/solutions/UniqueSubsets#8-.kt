package Algorithms_QuestionSet_V1.solutions
fun main(){
    val array = arrayOf(2,1,2)
    findUniqueSubset(array)
}

fun findUniqueSubset(array: Array<Int>){
    val arrayLength = array.size-1

    val subsetArray = arrayListOf<ArrayList<Int>>()

    subsetArray.add(arrayListOf())

    (0..arrayLength).forEach { outerIndex->
        val subset = arrayListOf<Int>()
        subset.add(array[outerIndex])
        (0..arrayLength).forEach { innerIndex ->
                if (array[outerIndex]<=array[innerIndex]){
                    subset.add(array[innerIndex])
                }
        }
        subsetArray.add(subset)
    }

    println(subsetArray)

}