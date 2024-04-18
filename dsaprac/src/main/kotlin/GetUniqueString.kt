fun main() {
    GetUniqueString().getUniqueString()
}
class GetUniqueString {
    fun getUniqueString(){
        val alphabet: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
// Build list from 20 random samples from the alphabet,
// and convert it to a string using "" as element separator
        val randomString: String = List(13) { alphabet.random() }.joinToString("")
        println(randomString)
    }
}