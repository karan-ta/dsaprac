fun main() {
    HeadRecursion().headRecursion(3)
}
class HeadRecursion {
    fun headRecursion(n:Int){
        if(n <=0)
            return
        headRecursion(n - 1)
        println(n)
    }
}