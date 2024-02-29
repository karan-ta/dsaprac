fun main() {
    println(GlobalVariableRecursion().f(3))
}
class GlobalVariableRecursion {
    var x:Int = 0
    fun f(n:Int):Int{
        if(n <= 0)
            return 0
        x++
        return f(n - 1) + x

    }
}