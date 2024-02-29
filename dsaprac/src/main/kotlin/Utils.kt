class Utils {
    companion object{
        fun swap(A:IntArray,i:Int,j:Int){
            val temp = A[i]
            A[i] = A[j]
            A[j] = temp
        }
    }
}