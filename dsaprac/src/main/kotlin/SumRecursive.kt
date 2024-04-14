class SumRecursive {
    fun getRecursiveSum(n:Int):Int{
        if (n < 0)
            return 0
        return n + getRecursiveSum(n - 1)
    }
}

fun main() {
    println(SumRecursive().getRecursiveSum(3))
}