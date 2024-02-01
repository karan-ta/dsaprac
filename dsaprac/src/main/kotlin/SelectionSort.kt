fun main() {

}
class SelectionSort{
    fun swap(inputArray:IntArray,i:Int,j:Int){
        var temp = inputArray[i]
        inputArray[i] = inputArray[j]
        inputArray[j] = temp
    }
    fun selectionSort(inputArray:IntArray){
        var minIndex = 0
        for(i in 0..inputArray.size - 2){
            minIndex = i
            for(j in i+1 ..inputArray.size - 1){
                if(inputArray[j] < inputArray[minIndex]){
                    minIndex = j
                }
            }
            swap(inputArray,i,minIndex)
        }
    }
}