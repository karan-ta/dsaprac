fun main() {
    CountUpDownRecursive().countUpDown(5,"ascending")
}
class CountUpDownRecursive {
    fun countUpDown(n:Int,mode:String){
        if(n > 0)
        {
            if (mode == "descending")
                println(n)
            countUpDown(n - 1,mode)
            if(mode == "ascending")
                println(n)
        }
    }
}