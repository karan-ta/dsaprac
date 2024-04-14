package kotlinprac
fun main() {
//    LoopsPrac().arrayIndices(intArrayOf(1,2,3,4))
//      LoopsPrac().arrayWithIndex(intArrayOf(1,2,3,4))
//      LoopsPrac().assignReturnToVariable()
      LoopsPrac().returnQualifyLabel()
}
class LoopsPrac {
    fun arrayIndices(arr:IntArray){
        for (i in arr.indices)
            println("$i - ${arr[i]}")
    }
    fun arrayWithIndex(arr:IntArray){
        for((key,value) in arr.withIndex()){
            println("$key - $value")
        }
    }
    fun assignReturnToVariable(){
        val name = null
        val s = name?:return
    }

    fun returnQualifyLabel(){
        listOf(1,2,3,4,5).forEach lit@{
            if(it == 3) return@lit
        }
        println("we wish to print this")
    }
}