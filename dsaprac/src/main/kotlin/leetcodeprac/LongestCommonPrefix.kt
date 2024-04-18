package leetcodeprac
fun main() {
    LongestCommonPrefix().getLongestCommonPrefix(arrayOf("flo","flow","flower","f")).let { println(it) }
}
class LongestCommonPrefix {
    fun getLongestCommonPrefix(inputStringArray:Array<String>):String{
        var stringMatchedSoFar = inputStringArray[0]
        inputStringArray.forEach {
        var numCharactersMatched = 0
        it.forEachIndexed { index, character ->
            if(index == 0 && character != stringMatchedSoFar[0])
                return "no"
            else if(index >= stringMatchedSoFar.length || character != stringMatchedSoFar[index])
                return@forEachIndexed
            else if(character == stringMatchedSoFar[index]){
                numCharactersMatched++
            }

        }
            if(numCharactersMatched  > stringMatchedSoFar.length)
                stringMatchedSoFar = stringMatchedSoFar.substring(0,stringMatchedSoFar.length)
            else
                stringMatchedSoFar = stringMatchedSoFar.substring(0,numCharactersMatched)
        }
        return stringMatchedSoFar
    }
}