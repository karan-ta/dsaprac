fun main() {
    val inputArray = intArrayOf(10,20,30,20,1)
//    Utils.swap(inputArray,0,3)
    PartitionProceedure().partition(inputArray,0,4)
    inputArray.forEach { println(it) }
}

class PartitionProceedure {
    fun partition(A:IntArray,l:Int,h:Int){
        //i cannot be 0 as call to partition may not start from 0
        // i cannot be l + 1 as if there are only two elements - then i , j both start at last element and swapping cannot happen - example (10,20)
        var i = l
        //i cannot be l+1 as i may need to be l as - first element may be greatest element so i will roll out of array and not stay at first element to enable swapping
        var j = h
        val pivot = A[l]
//        if i is greater than or eaual to j - we have already swapped all elements no so need to do further
        while(i < j) {
            // i and j should both be within array bounds
            while (i < A.size && A[i] <= pivot)
                i++
            println("$j,$A[j],$pivot")
            while (j > -1 && A[j] > pivot)
                j--
            // if i and j have crossed each other then we should not swap as i or j are at undesired element currently
            if (i < j) {
                println("swapping in while $l,$j")
                Utils.swap(A, i, j)
                i++
                j--
            }
        }
        println("swapping $l,$j")
        Utils.swap(A,l,j)
    }
}