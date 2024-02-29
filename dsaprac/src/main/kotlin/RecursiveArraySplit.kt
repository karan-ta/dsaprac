fun main() {
    RecursiveArraySplit().arraySplit(intArrayOf(5,4,3,2,1),0,4)
}

class RecursiveArraySplit {
    fun arraySplit(A:IntArray,p:Int,r:Int){
        if(p == r)
            return
        var q:Int = (p + r) / 2
        println("================= $p,$q,${q+1},$r ======================= ")
        arraySplit(A,p,q)
        arraySplit(A,q+1,r)
        println("-------------- $p,$q,${q+1},$r ---------------- ")
        println(A.slice(p..q))
        println(A.slice(q+1 .. r))

    }
}