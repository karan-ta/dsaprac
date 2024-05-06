package leetcodeprac
//https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150
fun main() {
    SummaryRanges().getSummaryRanges(intArrayOf(0,2,3,4,6,8,9))
}
class SummaryRanges {
    fun getSummaryRanges(nums:IntArray){
        var previous = nums[0]
        val listOfRanges = mutableListOf<List<Int>>()
        var currentList = mutableListOf<Int>()

        nums.forEach {
            if(it == previous || it == previous + 1)
                currentList.add(it)
            else{
                listOfRanges.add(currentList)
                currentList = mutableListOf<Int>()
                currentList.add(it)

            }
            previous = it
        }
        listOfRanges.add(currentList)
        listOfRanges.forEach{
            println(it)
        }
    }
}