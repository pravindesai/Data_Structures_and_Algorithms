package Algorithms_QuestionSet_V1.solutions

fun stockBuyAndSell(prices: Array<Int>): Int {
    var profit = 0

    for (i in 1 until prices.size) {
        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1]
        }
    }

    return profit
}

fun main() {
    val prices = arrayOf(3, 4, 1, 5)
    val maxProfit = stockBuyAndSell(prices)
    println("Maximum Profit: $maxProfit")

    val prices2 = arrayOf(1, 3, 5, 7, 9)
    val maxProfit2 = stockBuyAndSell(prices2)
    println("Maximum Profit: $maxProfit2")


}
