fun main() {
    IndirectRecursion().funA(20)
}
class IndirectRecursion {
    fun funA(n:Int){
        if(n <= 0)
            return
        println(n)
        funB(n - 1)
    }
    fun funB(n:Int){
        if(n <=1)
            return
        println(n)
        funA(n/2)
    }

}
