package leetcodeprac

fun main() {
    LC2965MissingAndRepeated().findMissingAndRepeatedValues(
        arrayOf(
            intArrayOf(1,3),
            intArrayOf(2,2)
        )
    )
}
class LC2965MissingAndRepeated {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val outputArray = IntArray(2)
        val frequencyArray = IntArray(grid[0].size * grid[0].size)
        grid.forEach {
            it.forEach {
                frequencyArray[it - 1] += 1
            }
        }
        frequencyArray.forEachIndexed { index, it ->
            when(it){
                0 -> outputArray[1] = index + 1
                2 -> outputArray[0] = index + 1

            }
        }
        return outputArray
    }
}