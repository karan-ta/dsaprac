fun main() {
    var A = intArrayOf(1,2,3,4,5)
    InsertionSortDescending().InsertionSortDescending(A,5)
    A.forEach {
        println(it)
    }
}
class InsertionSortDescending {
    fun InsertionSortDescending(A:IntArray,n:Int){
        for(i in 1..n - 1){
            var j = i - 1
            var x = A[i]
            while(j > -1 && A[j] < x){
                A[j+1] = A[j]
                j--
            }
            A[j+1] = x
        }
    }
}