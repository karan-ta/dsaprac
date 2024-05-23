package leetcodeprac

fun main() {
    LC2270ArraySplitLeftRightSum().waysToSplitArray(intArrayOf(0,-1,-2,-3,-4,-5)).let { println(it) }
}
class LC2270ArraySplitLeftRightSum {
    fun waysToSplitArray(nums:IntArray):Int {
        var sum:Long = 0
        var numSplitAnswer = 0
        val rSum = LongArray(nums.size)
        for(i in nums.size - 1 downTo 0){
            rSum[i] = sum
            sum += nums[i]
        }
        rSum.forEach {
            println(it)
        }
        sum = 0
        for(i in 0 until nums.size - 1){
            sum += nums[i]
            if(sum >= rSum[i])
                numSplitAnswer++
        }

        return numSplitAnswer
    }
}