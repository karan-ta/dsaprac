package leetcodeprac

fun main() {
    CheckArraySortedRotatedLC1752().checkArraySortedRotated(intArrayOf(3,4,5,1,2)).let { println(it) }
}
class CheckArraySortedRotatedLC1752 {
    fun checkArraySortedRotated(nums:IntArray):Boolean{
        var previous = -1
        var rotationCount = 0

        nums.forEach {
            if(it < previous)
                rotationCount++
            previous = it
        }
        if(rotationCount == 1)
            return true
        else
            return false

    }
}