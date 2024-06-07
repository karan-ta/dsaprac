package leetcodeprac


fun main() {
    LC3091ApplyIncrementDuplicateOp().minOperations(2).let {
        println(it)
    }
}
class LC3091ApplyIncrementDuplicateOp {
    fun getDuplicateOperationsNum(incrementedNum:Int,k:Int):Int{
        val tempList = mutableListOf<Int>()
        var sumAnswer = 0
        while (sumAnswer < k){
            tempList.add(incrementedNum)
            sumAnswer += incrementedNum
        }
        return tempList.size - 1
    }
    fun minOperations(k: Int): Int {
        if(k == 1)
            return 0
        var initial = 1
        var minOperationsAnswer = 0
        var currentTotalOpCount = 0
        var incrOpCount = 0
        var duplicateOpCount = 0
        while(true){
            incrOpCount++
            initial++
            duplicateOpCount = getDuplicateOperationsNum(initial,k)
            currentTotalOpCount = incrOpCount + duplicateOpCount
            if(minOperationsAnswer > 0 && currentTotalOpCount > minOperationsAnswer){
                break
            }
            else
                minOperationsAnswer = currentTotalOpCount
        }
        return minOperationsAnswer
    }
}