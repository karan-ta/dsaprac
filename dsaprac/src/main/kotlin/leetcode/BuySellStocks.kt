package leetcode

class BuySellStocks {
    fun maxProfit(prices: IntArray): Int {
        var currentMin = prices[0]
        var maxProfit = 0
        prices.forEach {
            if(it < currentMin)
                currentMin = it
            if(it - currentMin > maxProfit)
                maxProfit = it - currentMin
        }
        return maxProfit
    }
}