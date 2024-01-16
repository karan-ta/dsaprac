fun main() {

}
class SelectionSort{
    fun swap(inputArray:IntArray,i:Int,j:Int){
        var temp = inputArray[i]
        inputArray[i] = inputArray[j]
        inputArray[j] = temp

    }
    fun selectionSort(inputArray:IntArray){
        var i = 0
        var j = 1
        var minIndex = 0
        while(i < inputArray.size - 1){
            minIndex = i
            j = i + 1
            while(j < inputArray.size){
                if(inputArray[j] < inputArray[minIndex]){
                    minIndex = j
                }
            j++
            }
            swap(inputArray,i,minIndex)
            i++
        }
    }
}