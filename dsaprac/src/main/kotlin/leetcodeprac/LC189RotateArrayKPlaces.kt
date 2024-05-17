package leetcodeprac

fun main() {
    LC189RotateArrayKPlaces().rotateArray(intArrayOf(3,4,5,6,7),2)
}
class LC189RotateArrayKPlaces {
    fun reverseArray(nums:IntArray,start:Int,end:Int){
        var left = start
        var right = end - 1
        while(left < right){
            var temp = nums[right]
            nums[right] = nums[left]
            nums[left] = temp
            left ++
            right --
        }

    }
    fun rotateArray(nums:IntArray,k:Int){
        rotateArrayDirection(nums,k,"right")
    }
    fun rotateArrayDirection(nums:IntArray,k:Int,direction:String){
        if(direction == "left"){
            reverseArray(nums,0,k)
            reverseArray(nums,k,nums.size)
            reverseArray(nums,0,nums.size)
        }
        if(direction == "right"){
            reverseArray(nums,0,nums.size - k)
            reverseArray(nums,nums.size - k,nums.size)
            reverseArray(nums,0,nums.size)
        }
        nums.forEach {
            println(it)
        }
    }
}