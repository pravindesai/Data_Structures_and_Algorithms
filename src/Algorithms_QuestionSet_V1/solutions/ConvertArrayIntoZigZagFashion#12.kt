package Algorithms_QuestionSet_V1.solutions


fun main(){
    val arrayList = arrayListOf<Int>(4,3,7,8,6,2,1)
    zigZag(arrayList)
    println("$arrayList \tas Zig Zag array is\t $arrayList")

    val arrayList2 = arrayListOf<Int>(1,4,3,2)
    zigZag(arrayList2)
    println("$arrayList2 \t\t\tas Zig Zag array is\t $arrayList2")

}

fun zigZag(array: ArrayList<Int>){
    var switch = true
    //  true = <    false = >
    (0..array.size-2).forEachIndexed { index, _ ->
        when(switch){
            true -> {
                if (array[index]>array[index+1]){
                    val temp = array[index]
                    array[index] = array[index+1]
                    array[index+1] = temp
                }
            }

            false ->{
                if (array[index]<array[index+1]){
                    val temp = array[index]
                    array[index] = array[index+1]
                    array[index+1] = temp
                }
            }
        }
        switch = switch.not()
    }
}