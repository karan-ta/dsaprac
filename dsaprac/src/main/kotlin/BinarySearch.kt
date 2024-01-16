fun main() {
    BinarySearch().binarySearch(intArrayOf(1,2,3,4,5),1).let{
        println(it) }
}
class BinarySearch{
    fun binarySearch(inputArray:IntArray,target:Int):Int{
        var low = 0
        var high = inputArray.size - 1
        var mid = 0
        while (low <= high){
            mid = low + (high - low)/2
            if(inputArray[mid] == target)
                return mid
            else if(target > inputArray[mid])
                low = mid + 1
            else if(target < inputArray[mid])
                high = mid - 1

        }
        return -1
    }
}