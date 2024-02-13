fun main() {
    MergeSort().mergeSort(intArrayOf(1,2,3,4,5,6),0,5)
}
class MergeSort {
    fun mergeSort(A:IntArray,l:Int,h:Int){
        val mid = l + (h - l) / 2
        if(l < h){
            mergeSort(A,l,mid)
            mergeSort(A,mid + 1,h)

        }
        A.slice(l..h).forEach {
            println(it)
        }
        println("========================")
    }
}