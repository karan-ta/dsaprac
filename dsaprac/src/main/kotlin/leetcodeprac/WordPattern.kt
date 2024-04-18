package leetcodeprac

fun main() {
    WordPattern().getResult("dog cat cat dog","aaaa").let { println(it) }
}
class WordPattern {
    fun getResult(inputString:String,pattern:String):Boolean{
        val currentAlphabetList = mutableListOf<Char>()
        var wordCounter = 0
        val alphabetToWordMap = mutableMapOf<Char,String>()
        var currentWord = ""
        inputString.forEachIndexed { index, it ->
            when{
                it == ' ' || index == inputString.length - 1  -> {
                    if(index == inputString.length - 1)
                        currentAlphabetList.add(it)
                    println(currentAlphabetList.joinToString(""))
                    currentWord = currentAlphabetList.joinToString("")
                    if(alphabetToWordMap.get(pattern[wordCounter]) == null){
                        alphabetToWordMap.put(pattern[wordCounter],currentWord)
                    }
                    else{
                        if(alphabetToWordMap.get(pattern[wordCounter]) != currentWord)
                            return false
                    }
                    currentAlphabetList.removeAll { true }
                    wordCounter++
                }
                else->{
                    currentAlphabetList.add(it)
                }
            }
        }
        return true
    }
}