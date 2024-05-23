package leetcodeprac

fun main() {

    LC2574LeftRightSumDifference().leftRightDifference(intArrayOf(1)).let{
//        it.forEach {
//            println(it)
//        }
    }
}
class LC2574LeftRightSumDifference {
    fun leftRightDifference(nums: IntArray): IntArray {
        var sum = 0
        var lSum = IntArray(nums.size)
        var rSum = IntArray(nums.size)
        var answers = IntArray(nums.size)
        for (i in nums.size - 1 downTo 0){
            rSum[i] = sum
            sum += nums[i]
        }
        println("---------- rsum --------------------")
//        rSum.let{
//            it.forEach {
//                println(it)
//            }
//        }
        sum = 0
        for (i in 0 until nums.size){
            lSum[i] = sum
            sum += nums[i]
        }
        for (i in 0 until nums.size){
            answers[i] = Math.abs(lSum[i] - rSum[i])
        }
        println("---------- answers --------------------")
        return answers
    }
}