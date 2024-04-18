package leetcodeprac

import Utils

fun main() {
    RansomNoteMagazine().getResult("abcd","edcba").let{ println(it) }
}
class RansomNoteMagazine {

    fun getResult(ransomNote:String,magazine:String):Boolean{
        var magazineAlphabetCounter = IntArray(26){0}
        magazine.forEach {
            val charIndex = Utils.alphabetToNumber.get(it)
            magazineAlphabetCounter[charIndex!!] += 1
        }
        ransomNote.forEach {
            val charIndex = Utils.alphabetToNumber.get(it)
            when{
                magazineAlphabetCounter[charIndex!!] == 0 -> return false
                else -> {
                    magazineAlphabetCounter[charIndex!!] -= 1

                }
            }
        }
        return true
    }
}