fun main() {
    val inputArray = intArrayOf(7,5,1,3,2,8)
    InsertionSort().insertionSort(inputArray,6)
    inputArray.forEach {
        println(it)
    }
}
class InsertionSort {
    fun insertionSort(A:IntArray,n:Int) {
        for(i in 1..n-1){
            var j = i -1
            var x = A[i]
            while(j > -1 && A[j] > x){
                A[j+1] = A[j]
                j --
            }
            A[j+1] = x
        }
    }
}