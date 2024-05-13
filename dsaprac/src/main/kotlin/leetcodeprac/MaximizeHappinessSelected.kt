package leetcodeprac

fun main() {
    MaximizeHappinessSelected().maximumHappinessSum(intArrayOf(2,3,4,5),1).let { println(it) }
}

class MaximizeHappinessSelected {
    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
        happiness.sort()
        var k = k
        var result:Long = 0
        for (i in 0 until k){
            val currentHappiness = happiness[happiness.lastIndex - i] - i
            if(currentHappiness > 0)
                result += currentHappiness
        }
        return result
    }
}