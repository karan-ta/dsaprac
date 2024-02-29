fun main() {
    val inputArray = intArrayOf(1,2,3,5,4,6)
    MergeSort().mergeSort(inputArray,0,5)
    inputArray.forEach { println(it) }
}
class MergeSort{
    fun merge(A:IntArray,p:Int,q:Int,r:Int){
        val arr1 = A.slice(p..q)
        val arr2 = A.slice(q+1..r)
        var i = 0;var j = 0;var k = p
        while(i < arr1.size && j < arr2.size){
            if(arr1[i] < arr2[j])
               A[k++] = arr1[i++]
            else
                A[k++] = arr2[j++]
        }
        while(i < arr1.size)
            A[k++] = arr1[i++]

        while(j < arr2.size)
            A[k++] = arr2[j++]


    }
    fun mergeSort(A:IntArray,p:Int,r:Int){
        if(p == r)
            return
        val q = (p+r)/2
        mergeSort(A,p,q)
        mergeSort(A,q+1,r)
        merge(A,p,q,r)
    }
}
