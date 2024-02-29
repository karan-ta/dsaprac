fun main() {
    TreeRecursion().f(3)
}
class TreeRecursion {
    fun f(n:Int){
        if(n<=0)
            return
        println(n)
        f(n-1)
        f(n-1)
    }
}