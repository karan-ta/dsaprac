package leetcodeprac

fun main() {
    LC128LongestSequence().getLongestSequence(intArrayOf(100,4,200,1,3,2)).let { println(it) }
}
class LC128LongestSequence {
    fun getLongestSequence(nums:IntArray):Int{
        val inputNumSet = mutableSetOf<Int>()
        nums.forEach {
            inputNumSet.add(it)
        }
        var isStartOfSubsequence = false
        var maxSubsequenceLength = 0

        nums.forEach {
            if(!inputNumSet.contains(it - 1)){
            isStartOfSubsequence = true
            }
            else{
                isStartOfSubsequence = false
            }
            if(isStartOfSubsequence){
                var currentMaxSubsequenceLength = 1
                var nextElement = it + 1
                while(inputNumSet.contains(nextElement)){
                    currentMaxSubsequenceLength++
                    nextElement++
                }
                if(currentMaxSubsequenceLength > maxSubsequenceLength)
                    maxSubsequenceLength = currentMaxSubsequenceLength

            }
        }
        return maxSubsequenceLength


    }

}