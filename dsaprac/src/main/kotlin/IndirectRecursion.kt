fun main() {
    IndirectRecursion().funA(20)
}
class IndirectRecursion {
    fun funA(n:Int){
        if(n <= 0)
            return
        println(n)
        funB(n - 1)
    }
    fun funB(n:Int){
        if(n <=1)
            return
        println(n)
        funA(n/2)
    }

}


git add dsaprac/src/main/kotlin/GlobalVariableRecursion.kt
git add dsaprac/src/main/kotlin/HeadRecursion.kt
git add dsaprac/src/main/kotlin/IndirectRecursion.kt
git add dsaprac/src/main/kotlin/MergeProc.kt
git add dsaprac/src/main/kotlin/PartitionProceedure.kt
git add dsaprac/src/main/kotlin/Quicksort.kt
git add dsaprac/src/main/kotlin/RecursiveArraySplit.kt
git add dsaprac/src/main/kotlin/TailRecursion.kt
git add dsaprac/src/main/kotlin/TreeRecursion.kt
git add dsaprac/src/main/kotlin/Utils.kt
