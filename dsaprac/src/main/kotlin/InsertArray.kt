fun main() {
    InsertArray().insertArray(intArrayOf(1,2,3,4,5,0),0,99)
}
class InsertArray {
    fun insertArray(A:IntArray,index:Int,elem:Int){
        if(index > A.size - 1 || index < 0)
            return
        if(index == A.size - 1){
            A[index] = elem
            A.forEach {
                println(it)
            }
            return
        }
        val x = A[index]
        for(i in A.size - 2 downTo index) {
            A[i + 1] = A[i]
        }
        A[index] = elem
        A.forEach {
            println(it)
        }
    }
}