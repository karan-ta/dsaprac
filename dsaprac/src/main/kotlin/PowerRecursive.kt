class PowerRecursive {
    fun getPowerRecursive(num:Int,n:Int):Int{
        if(n == 0)
            return 1
        return num * getPowerRecursive(num,n-1)

    }
}

fun main() {
    PowerRecursive().getPowerRecursive(2,3).let{
        println(it)
    }
}