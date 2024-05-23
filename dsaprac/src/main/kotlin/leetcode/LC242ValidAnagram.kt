package leetcode

fun main() {
    LC242ValidAnagram().isAnagram("karan","narak")
}
class LC242ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        val sHashmap = hashMapOf<Char,Int>()
        val tHashmap = hashMapOf<Char,Int>()
        s.forEach {
            sHashmap.put(it,(sHashmap.get(it)?:0) + 1)
        }
        t.forEach {
            tHashmap.put(it,(tHashmap.get(it)?:0) + 1)
        }
        return sHashmap == tHashmap

    }
}
