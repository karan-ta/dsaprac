fun main() {
    FactorialRecursive().factorialRecursive(5).let { println(it) }
}
class FactorialRecursive {
    fun factorialRecursive(n:Int):Int{
        if(n == 1){
            return 1
        }
        return n * factorialRecursive(n-1)
    }
}