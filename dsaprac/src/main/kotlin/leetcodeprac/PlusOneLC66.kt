package leetcodeprac

class PlusOneLC66 {
    fun getPlusOneResultArray(nums:IntArray){
        var carry = 0
        nums.reverse()
        nums.forEachIndexed { index, digit ->
           when{
               index == 0 && digit + 1 < 10 -> nums[0] = digit + 1
               index == 0 && digit + 1 >= 10 -> {
                   nums[0] = getUnitsPlace(digit + 1)
                   carry = getTensPlace(digit + 1)
               }
               else->{
                   when{
                       digit + carry < 10 -> nums[index] = digit + carry
                       digit + carry >= 10 -> {
                           nums[index] = getUnitsPlace(digit + 1)
                           carry = getTensPlace(digit + 1)

                       }
                   }
               }
           }
        }
        nums.reverse()
        val outputArray = IntArray(nums.size + 1)
        outputArray.forEachIndexed{index,it ->
            when{
                index == 0 -> outputArray[0] = carry
                else-> outputArray[index] = nums[index - 1]
            }

        }
    }
}