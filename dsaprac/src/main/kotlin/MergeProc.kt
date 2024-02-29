fun main() {
    MergeProc().mergeProc(intArrayOf(1,3,5,2,4,6,7,8),0,2,7)
}
class MergeProc {
    fun mergeProc(A:IntArray,p:Int,q:Int,r:Int){
        val arr1 = A.slice(p..q)
        val arr2 = A.slice(q+1..r)

        var i = 0;var j = 0; var k = 0
        while(i < arr1.size && j < arr2.size){
            if(arr1[i] < arr2[j]){
                A[k++] = arr1[i++]
            }
            else
                A[k++] = arr2[j++]

        }
        while(i < arr1.size){
            A[k++] = arr1[i++]
        }
        while(j < arr2.size){
            A[k++] = arr2[j++]
        }
        A.forEach { println(it) }
    }
}