package leetcodeprac

fun main() {
    KSmallestPrimeFraction().kthSmallestPrimeFraction(intArrayOf(1,7),1).let { it.forEach {
        println(it)
    }}
}
class KSmallestPrimeFraction {
    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        var fractionValueToNumDenMap = mutableMapOf<Double,IntArray>()
        for(i in 0 until arr.size - 1){
            for(j in i + 1 until arr.size){
//                println(arr[i].toString()+"---"+arr[j].toString())
                fractionValueToNumDenMap.put(arr[i].toDouble()/arr[j].toDouble(),intArrayOf(arr[i],arr[j]))
            }
        }
        fractionValueToNumDenMap = fractionValueToNumDenMap.toSortedMap()
        val targetKey = fractionValueToNumDenMap.keys.elementAt(k - 1)
        return fractionValueToNumDenMap.get(targetKey)!!
    }
}