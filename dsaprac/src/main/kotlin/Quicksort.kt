fun main() {
    val inputArray = intArrayOf(5,4,2,3,1)
//    Quicksort().partition(inputArray,0,4)
    QuickSort().quickSort(inputArray,0,4)
    inputArray.forEach { println(it) }
}

class QuickSort {
    fun partition(A:IntArray,l:Int,h:Int):Int{
        val pivot = A[l]
        var i = l
        var j = h
       while(i < j){
           while(i < A.size && A[i] <= pivot)
               i++
           while(j > -1 && A[j] > pivot)
               j--
           if(i < j) {
               Utils.swap(A, i, j)
               i++
               j--
           }
       }
        Utils.swap(A,l,j)
        return j
//        val i
    }
    fun quickSort(A:IntArray,l:Int,h:Int){
        if(l >= h)
            return
        val j = partition(A,l,h)
        quickSort(A,l,j)
        quickSort(A,j+1,h)
    }
}