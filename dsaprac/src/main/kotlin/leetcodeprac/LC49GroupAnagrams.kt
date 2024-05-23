package leetcodeprac

fun main() {
    LC49GroupAnagrams().groupAnagrams(arrayOf("karan","narak","aba","aab"))
}
class LC49GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val wordCharCount = hashMapOf<Char,Int>()
        val outputHashMap = hashMapOf<HashMap<Char,Int>,MutableList<String>>()
        strs.forEach {
            val wordCharCount = hashMapOf<Char,Int>()
            it.forEach {
                wordCharCount.put(it,(wordCharCount.get(it)?:0) + 1)
            }
            val currentGroup = outputHashMap.get(wordCharCount)?: mutableListOf()
            currentGroup.add(it)
            outputHashMap.put(wordCharCount,currentGroup)
//            println(wordCharCount)
//            println(outputHashMap)
        }

        val outputList:MutableList<List<String>> = mutableListOf()
        for(currentList in outputHashMap.values){
            outputList.add(currentList)
        }
//        println(outputList.toList())
        return outputList.toList()
    }
}