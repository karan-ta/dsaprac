package leetcode
fun main() {
    SubStringMatch().strStr("butsad","sad").let { println(it) }
}
class SubStringMatch {
    fun strStr(haystack: String, needle: String): Int {
        var hayStackIndex = 0
        var needleIndex = 0
        while (hayStackIndex < haystack.length){
            when{
                needleIndex == needle.length  -> {
//                    println("returning")
                    return hayStackIndex - needleIndex
                }
                haystack[hayStackIndex] == needle[needleIndex] -> {
//                    println("match")
                    needleIndex++
                }
                else ->{
//                    println("no match")
                    hayStackIndex -= needleIndex
                    needleIndex = 0
                }
            }
            hayStackIndex++
        }
        when{
            needleIndex == needle.length -> return hayStackIndex - needleIndex
            else -> return -1
        }
    }
}

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/solutions/3250360/think-as-a-sliding-window-code-like-a-pro-beats-100/?envType=study-plan-v2&envId=top-interview-150