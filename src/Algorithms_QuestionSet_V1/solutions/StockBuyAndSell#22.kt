package Algorithms_QuestionSet_V1.solutions

fun main(){

    val stockList = arrayListOf<Int>(100,180,260,310,40,535,695)
    stockBuySell(stockList)
}

fun stockBuySell(stockList: ArrayList<Int>) {
    val buySellArray = arrayListOf<ArrayList<Int>>()
    var initProfit = 0

    (0 until stockList.size).forEach { buyIndex ->
            (buyIndex until stockList.size).forEach { sellIndex ->
                val isProfitableTrade = stockList[buyIndex]<stockList[sellIndex]
                val profit = stockList[sellIndex].minus(stockList[buyIndex])
                if (isProfitableTrade && profit>initProfit){
                    buySellArray.clear()
                    buySellArray.add(arrayListOf(buyIndex,sellIndex))
                    initProfit = profit
                }
            }
    }
    println("For most profit Buy-Sell days pairs are $buySellArray")
}
