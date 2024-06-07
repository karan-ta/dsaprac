package leetcodeprac

fun main() {
    LC238ProductExceptSelf().productExceptSelf(
        intArrayOf(-1,1,0,-3,3)
    ).let {
        it.forEach {
            println(it)
        }
    }
}
class LC238ProductExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val rProd = IntArray(nums.size)
        val lProd = IntArray(nums.size)
        val answers = IntArray(nums.size)
        var currentProduct = 1

        for(i in nums.size - 1 downTo 0){
            rProd[i] = currentProduct
            currentProduct *= nums[i]
    }
        currentProduct = 1
        for(i in 0 until nums.size){
            lProd[i] = currentProduct
            currentProduct *= nums[i]
        }
        answers.forEachIndexed { i, it ->
            answers[i] = lProd[i] * rProd[i]
        }
        return answers
}
}