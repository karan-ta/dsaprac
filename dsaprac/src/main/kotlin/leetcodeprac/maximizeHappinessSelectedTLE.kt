//package leetcodeprac
//
//fun main() {
//    MaximizeHappinessSelected().maximumHappinessSum(intArrayOf(12,1,42),3).let { println(it) }
//}
//class MaximizeHappinessSelectedTLE1 {
//    fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
//        val sortedIndexes = mutableListOf<Int>()
//        var happinessList = happiness.toMutableList()
//        var result:Long = 0
//        val happinessListSorted = happinessList.sortedDescending()
//        happinessListSorted.forEach {
//            val currentIndex = happinessList.indexOf(it)
//            sortedIndexes.add(currentIndex)
//            happinessList.removeAt(currentIndex)
//            happinessList.add(currentIndex,0)
////            println(happinessList)
//        }
////        println(sortedIndexes)
//        happinessList = happiness.toMutableList()
//        for (i in 0 until k){
//            var currentHappiness = happinessList.get(sortedIndexes.get(i)) - i
//            if(currentHappiness < 0)
//                currentHappiness = 0
//            result += currentHappiness
//            happinessList.removeAt(sortedIndexes.get(i))
//            happinessList.add(sortedIndexes.get(i),0)
////            happinessList.replaceAll {
////                if(it > 0)
////                    it - 1
////                else
////                    0
////            }
//
//        }
//        return result
//    }
//}