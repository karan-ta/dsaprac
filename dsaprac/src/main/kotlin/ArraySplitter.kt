fun main() {
    ArraySplitter().arraySplitter(intArrayOf(1,2,3,4))
}
class ArraySplitter {
    fun arraySplitter(A:IntArray){
        if(A.size == 1) {
            println(A[0])
            println("==============")
            return
        }
        arraySplitter(A.slice(0..A.size/2 - 1).toIntArray())
        arraySplitter(A.slice(A.size/2..A.size - 1).toIntArray())
    }
}