class Utils {
    companion object{
        fun swap(A:IntArray,i:Int,j:Int){
            val temp = A[i]
            A[i] = A[j]
            A[j] = temp
        }
        val alphabetToNumber = mapOf<Char,Int>(
            'a' to 0,
            'b' to 1,
            'c' to 2,
            'd' to 3,
            'e' to 4,
            'f' to 5,
            'g' to 6,
            'h' to 7,
            'i' to 8,
            'j' to 9,
            'k' to 10,
            'l' to 11,
            'm' to 12,
            'n' to 13,
            'o' to 14,
            'p' to 15,
            'q' to 16,
            'r' to 17,
            's' to 18,
            't' to 19,
            'u' to 20,
            'v' to 21,
            'w' to 22,
            'x' to 23,
            'y' to 24,
            'z' to 25
            )
    }
}