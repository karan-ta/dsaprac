fun main() {
    TwoStringHalves().isStringHalvesAlike("Book")
}
//Leetcode 1704
class TwoStringHalves {
    fun countVowelInString(input:String):Int{
        var vowelsCount = 0
        input.forEach {
            if(it in charArrayOf('a','e','i','o','u'))
                vowelsCount++
        }
        return vowelsCount
    }
    fun isStringHalvesAlike(input:String):Boolean{
        println("input is "+input)
        val totalStringLength = input.length
        if(totalStringLength %2 != 0)
            return false
        val firstHalf = input.substring(0,totalStringLength/2)
        val secondHalf = input.substring(totalStringLength/2)
        println("firstHalf, secondHalf are ${firstHalf}, ${secondHalf}")

        println("number of vowels in first half, second Half are ${countVowelInString(firstHalf)},${countVowelInString(secondHalf)} ")
        println("string alike result is "+(countVowelInString(firstHalf) == countVowelInString(secondHalf)).toString())
        if(countVowelInString(firstHalf) == countVowelInString(secondHalf))
            return true
        else
            return false
    }
}
