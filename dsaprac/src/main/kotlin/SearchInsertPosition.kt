fun main() {
    println(SearchInsertPosition().searchInsert(intArrayOf(1,3,5,6),7))
}
//leetcode 35
class SearchInsertPosition{
    var low = 0
    var high = -1
    var mid = 0
    fun searchInsert(nums: IntArray, target: Int): Int {
       if (high == -1)
           high = nums.size - 1
        while(low<= high) {


            mid = low + (high - low) / 2
            println("=================================")
            println(low)
            println(high)
            println(mid)
            println("===================================")
            if (target == nums[mid])
                return mid
            else if (target < nums[mid]) {
                high = mid - 1
            } else
                low = mid + 1
            searchInsert(nums, target)
        }
        return low + 1
    }
}