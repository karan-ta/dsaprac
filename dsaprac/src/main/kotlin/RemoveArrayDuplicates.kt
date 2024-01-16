fun main() {
    RemoveArrayDuplicates().removeArrayDuplicates(intArrayOf(1,1,2,3,3,3))

}
class RemoveArrayDuplicates{
    fun removeArrayDuplicates(inputArray:IntArray){
        var temp = inputArray[0]
        var i = 0
        var j = 1
        while(j < inputArray.size){

            if(inputArray[j] == temp){

            }
            else{
                temp = inputArray[j]
                i++

                inputArray[i] = temp
            }
            j++
        }
        inputArray.forEach {
            println(it)
        }
    }
}
