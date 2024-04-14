class TaylorRecursiveStatic {
    companion object{
        var p = 1
        var f = 1
    }
    var r = 1
    fun e(x:Int,n:Int):Int{
        if(n == 0)
            return 1
        r = e(x,n - 1)
        p = p*x
        f = f*n
        return r + p/f
    }
}

fun main() {
    TaylorRecursiveStatic().e(2,2).let {
        println(it)
    }
}