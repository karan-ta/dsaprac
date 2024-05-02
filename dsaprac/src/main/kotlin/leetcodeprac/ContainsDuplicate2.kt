package leetcodeprac
//https://leetcode.com/problems/contains-duplicate-ii/?envType=study-plan-v2&envId=top-interview-150
fun main() {
    ContainsDuplicate2().containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3),2).let { println(it) }
}
class ContainsDuplicate2 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numToIndiceMap = HashMap<ULong,ULong>()
        nums.forEachIndexed { index, it ->
            if(numToIndiceMap.containsKey(it.toULong()))
            {
                if(index.toULong() - numToIndiceMap.get(it.toULong())!!  <= k.toULong())
                    return true
            }
                numToIndiceMap.put(it.toULong(),index.toULong())
        }
        return false
    }
}