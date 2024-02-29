fun main() {
    TailRecursion().tailRecursion(3)
}

class TailRecursion {
    fun tailRecursion(n:Int) {
        if (n <= 0)
            return
        println(n)
        tailRecursion(n - 1)
    }
}