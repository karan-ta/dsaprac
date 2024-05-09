package leetcodeprac
//LC - 485
fun main() {
    MaxConsecutiveOnes().getMaxConsecutiveOnes(intArrayOf(1,0,1,1,0,1))
}
class MaxConsecutiveOnes {
    fun getMaxConsecutiveOnes(nums:IntArray){
        var oneCounter = 0
        var maxOneCounter = 0
        nums.forEach {
            if(it == 0){

                oneCounter = 0
            }
            else{
                oneCounter++
            }
            if(oneCounter > maxOneCounter)
                maxOneCounter = oneCounter
        }
        println(maxOneCounter)

    }
}