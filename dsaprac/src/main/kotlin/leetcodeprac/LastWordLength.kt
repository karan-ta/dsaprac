package leetcodeprac

fun main() {
    LastWordLength().getLastWordLength(" fly me to the   moon").let { println(it) }
}
class LastWordLength {
    fun getLastWordLength(inputString:String):Int{
        val wordCountList = mutableListOf<Int>()
        var currentAlphabetCount = 0
        inputString.forEach {
            when{
                it == ' ' -> {
                    if(currentAlphabetCount > 0){
                        wordCountList.add(currentAlphabetCount)
                    }
                    currentAlphabetCount = 0
                }
                else ->{
                    currentAlphabetCount++
                }
            }
        }
        if(currentAlphabetCount > 0)
            wordCountList.add(currentAlphabetCount)
        return wordCountList.last()
    }
}