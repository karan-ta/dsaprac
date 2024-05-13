//package leetcodeprac
//
//fun main() {
//    MaximizeHappinessSelectedTLE().maximumHappinessSum(intArrayOf(2,3,4,5),1).let {
//        println(it)
//    }
//}
//fun getMaxFromList(inputList:List<Int>):Pair<Int,Int>{
//    var maxAnswer:Int = 0
//    var indexAnswer = 0
//    inputList.forEachIndexed { index, it ->
//        if (it > maxAnswer) {
//            maxAnswer = it
//            indexAnswer = index
//        }
//    }
//    return Pair(maxAnswer,indexAnswer)
//}
//class MaximizeHappinessSelectedTLE {
//    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
//        val happinessList = happiness.toMutableList()
//
//        var result:Long = 0
//        for (i in 0 until k){
//            val maxFromList = getMaxFromList(happinessList)
//            result += maxFromList.first
//            happinessList.removeAt(maxFromList.second)
//            happinessList.replaceAll {
//                if(it > 0)
//                     it - 1
//                else
//                     0
//            }
//
//        }
//        return result
//    }
//}