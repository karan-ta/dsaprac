package leetcodeprac
fun main() {
LC347TopKElements().topKFrequent(intArrayOf(1,1,1,2,2,3,3),2)
}
class LC347TopKElements {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val inputCounts = hashMapOf<Int,Int>()
        val countToInputMapArray = arrayOf<MutableList<Int>>()
        nums.forEach{
            val currentCount = inputCounts.get(it)?:0
            inputCounts.put(it,currentCount+1)

        }
        inputCounts.forEach { t, u ->
            println(t)
            println(u)
            val currentCountList = countToInputMapArray[u]
            currentCountList.add(t)
            countToInputMapArray[u] = currentCountList
        }
        val outputList = mutableListOf<Int>()
        var topKAdded = false
        countToInputMapArray.forEach {
            if(it.size > 0 && !topKAdded){
                it.forEach {
                    outputList.add(it)
                    if(outputList.size == k)
                        topKAdded = true
                }


            }
        }
        return outputList.toIntArray()
    }
}
//49,347,560