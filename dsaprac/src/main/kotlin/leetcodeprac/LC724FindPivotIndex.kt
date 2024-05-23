package leetcodeprac

fun main() {
    LC724FindPivotIndex().pivotIndex(intArrayOf(3,1,3,4)).let { println(it) }
}
class LC724FindPivotIndex {
    fun pivotIndex(nums:IntArray):Int{
    var sum = 0
    val rsum = IntArray(nums.size)
    var pivotIndex = -1
    for(i in nums.size - 1 downTo 0){
        rsum[i] = sum
        sum += nums[i]
    }
        rsum.forEach {
//            println(it)
        }
        sum = 0
        for(i in 0 until nums.size){
            if(sum == rsum[i]){
                pivotIndex = i
                return pivotIndex
            }

            sum += nums[i]

        }
        return pivotIndex
    }
}