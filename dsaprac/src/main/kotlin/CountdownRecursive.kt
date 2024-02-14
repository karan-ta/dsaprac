fun main() {
    CountdownRecursive().countdownRecursive(5)
}
class CountdownRecursive {
    fun countdownRecursive(i:Int){
        if(i <= 0)
            return
        else
            //for descending order :
//            println(i)
            countdownRecursive(i - 1)
            println(i)

    }
}