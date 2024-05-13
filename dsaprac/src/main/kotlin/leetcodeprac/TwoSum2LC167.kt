package leetcodeprac
fun main() {
    TwoSum2LC167().twoSum(intArrayOf(-1,0),-1).let { it.forEach {
        println(it)

    }}
}
class TwoSum2LC167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        while(left < right){
            when{
                numbers[left] + numbers[right] > target -> right--
                numbers[left] + numbers[right] < target -> left++
                else -> break
            }
        }
        return intArrayOf(left+1,right+1)
    }
}