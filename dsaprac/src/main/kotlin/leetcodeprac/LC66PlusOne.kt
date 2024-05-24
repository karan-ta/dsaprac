package leetcodeprac

fun main() {
    LC66PlusOne().getPlusOneResultArray(
        intArrayOf(9,9,9,9)
    ).let{
        it.forEach {
            println(it)
        }
    }
}
class LC66PlusOne {
    fun getUnitsPlace(num:Int):Int{
        return num % 10
    }
    fun getTensPlace(num:Int):Int{
        return num/10
    }
    fun getPlusOneResultArray(nums:IntArray):IntArray{
        var carry = 0
        nums.reverse()
        nums.forEachIndexed { index, digit ->
           when{
               index == 0 && digit < 9 -> {
                   nums[0] = digit + 1
                   nums.reverse()
                   return nums
               }
               index == 0 && digit == 9 -> {
                   nums[0] = 0
                   carry = 1
               }
               else->{
                   when{
                       digit < 9 -> {
                           nums[index] = digit + carry
                           carry = 0
                       }
                       digit == 9 -> {
                           nums[index] = 0
                           carry = 1

                       }
                   }
               }
           }
        }
        if(carry == 0){
            nums.reverse()
            return nums
        }

        nums.reverse()
        val outputArray = IntArray(nums.size + 1)
        outputArray.forEachIndexed{index,it ->
            when{
                index == 0 -> outputArray[0] = 1
                else-> outputArray[index] = nums[index - 1]
            }

        }
        return outputArray
    }
}