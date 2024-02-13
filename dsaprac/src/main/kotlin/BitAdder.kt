fun main() {
BitAdder().BitAdder(intArrayOf(0,0,1),intArrayOf(1,0,0),3)
}
class BitAdder {
    fun BitAdder(A:IntArray,B:IntArray,n:Int){
        var C = IntArray(n+1)
        var carry = 0
        for(i in n - 1 downTo 0){
            if(A[i] + B[i] + carry >= 2)
                carry = 1
            else
                carry = 0
            C[i+1] = A[i] + B[i]
        }
        C[0] = carry
        C.forEach {
            println(it)
        }
    }
}