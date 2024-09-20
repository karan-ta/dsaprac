package leetcodeprac

fun main() {
    BinarySearchRotatedArray().binarySearchRotatedArray(intArrayOf(4,5,1,2,3),3).let{
        println(it)
    }
}
class BinarySearchRotatedArray {
    fun isLeftPartSorted(nums:IntArray,low:Int,mid:Int):Boolean{
        if(nums[mid] > nums[low])
            return true
        else
            return false
    }
    fun binarySearchRotatedArray(nums:IntArray,target:Int):Int{
        var low = 0
        var high = nums.size - 1
        while(low <= high){
            val mid = low + (high - low)/2
            if(target == nums[mid])
                return mid
            else if(isLeftPartSorted(nums,low,mid)){
                if(target >= nums[low] && target < nums[mid]) {
                    high = mid - 1
                }
                else{
                    low = mid + 1
                }
            }
            else{
                //left part is not sorted - so right part is sorted
                 if(target > nums[mid] && target <= nums[high]) {
                     low = mid + 1
                 }
                else{
                    high = mid - 1
                 }

            }
        }
        return -1
    }
}