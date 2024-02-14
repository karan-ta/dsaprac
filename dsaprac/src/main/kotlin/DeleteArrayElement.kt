fun main() {
    DeleteArrayElement().deleteArrayElement(intArrayOf(1,2,3,4,5),3)
}
class DeleteArrayElement {
    fun deleteArrayElement(A:IntArray,index:Int){
    if(index < 0 || index > A.size - 1)
        return
    if(index == A.size - 1){
        A[index] = 0
        A.forEach {
            println(it)
        }
        return
    }
    for(i in index + 1 .. A.size - 1)    {
        A[i - 1] = A[i]

    }
        A[A.size - 1] = 0
        A.forEach {
            println(it)
        }
    }
}