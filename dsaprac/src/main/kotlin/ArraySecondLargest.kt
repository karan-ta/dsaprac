fun main() {
    ArraySecondLargest().arraySecondLargest(intArrayOf(1,5,3,4))
}
class ArraySecondLargest{
    fun arraySecondLargest(inputArray:IntArray){
        var largest = -1
        var secondLargest = -1
        inputArray.forEach {
            if(it > largest){
                secondLargest = largest
                largest = it
            }
            else if(it > secondLargest){
                secondLargest = it
            }

        }
        println(secondLargest)

    }

}