package leetcodeprac

fun main() {
    RelativeRanksLC506().getRelativeRanks(intArrayOf(1,2,3,4,5))
}
class RelativeRanksLC506 {
    fun getRelativeRanks(nums:IntArray){
        val sortedNums = nums.sortedDescending()
        val tempHashmap = hashMapOf<Int,String>()
        val outputArray = Array<String>(nums.size){""}
        sortedNums.forEachIndexed { index, it ->
            when{
                index == 0 -> tempHashmap[it] = "Gold Medal"
                index == 1 -> tempHashmap[it] = "Silver Medal"
                index == 2 -> tempHashmap[it] = "Bronze Medal"
                else -> tempHashmap[it] = (index + 1).toString()

            }
        }

       nums.forEachIndexed { index, it ->
           outputArray[index] = tempHashmap[it]!!
       }
        outputArray.forEach {
            println(it)
        }


    }
}