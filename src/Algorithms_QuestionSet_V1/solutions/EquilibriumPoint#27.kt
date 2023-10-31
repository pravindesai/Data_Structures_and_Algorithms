package Algorithms_QuestionSet_V1.solutions

fun main(){

    val array = arrayOf(1,3,5,2,2)
    println("For [${array.joinToString(",")}] equilibrium point is ${equilibriumPoint(array)}")

    val array2 = arrayOf<Int>(1)
    println("For [${array2.joinToString(",")}] equilibrium point is ${equilibriumPoint(array2)}")

}

fun equilibriumPoint(array: Array<Int>):Int?{

    return if (array.size==1) {
        array[0]
    } else{
        (array.indices).forEach{ arrayIndex ->
            var additionBefore = 0
            var additionAfter = 0
                (array.indices).forEach{ evaluationIndex ->
                    if (evaluationIndex<arrayIndex){
                        additionBefore = additionBefore.plus(array[evaluationIndex])
                    }else if (evaluationIndex>arrayIndex){
                        additionAfter = additionAfter.plus(array[evaluationIndex])
                    }
            }
            if (additionBefore==additionAfter) return arrayIndex
        }
        null
    }

}





/* *
Given an array A of n positive numbers. The task is to find the first equilibrium point in an
array. Equilibrium point in an array is an index (or position) such that the sum of all elements
before that index is same as sum of elements after it.
Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.

Input: n = 5 A[] = {1,3,5,2,2} Output:
3 Explanation: equilibrium point is at position 3 as sum
of elements before it (1+3) = sum of elements after it
(2+2).
* */