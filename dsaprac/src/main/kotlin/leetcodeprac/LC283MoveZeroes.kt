package leetcodeprac

fun main() {
    MoveZeroesLC283().moveZeroes(intArrayOf(0))
}
class MoveZeroesLC283 {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        var right = 0
        while(right < nums.size){
            if(nums[left] != 0) {
                left ++
                right = left + 1
            }
            else if(nums[right] == 0){
                right ++
            }
            else{
//                println("inside else------------------")
//                println(left)
//                println(right)
                nums[left] = nums[right]
                nums[right] = 0
                left++
                right = left + 1
                nums.forEach { println(it) }
//                println("==============================")
            }
        }
//        nums.forEach {
//            println(it)
//        }
    }
}