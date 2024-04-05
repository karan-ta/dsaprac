package kotlinprac

fun main() {
//    JumpPrac().breakOuter()
//      JumpPrac().lambdaNonLocalReturn()
//      JumpPrac().lambdaLocalReturn()
        JumpPrac().lambdaLocalReturnAnonFunc()
}
class JumpPrac {
    fun breakInner(){
        for(i in 1..3)
            for(j in 'a'..'c'){
                if(i == 2)
                    break
                println("$i - $j")

            }
    }

    fun breakOuter(){
        outer@ for(i in 1..3)
            for(j in 'a'..'c'){
                if(i == 2)
                    break@outer
                println("$i - $j")
            }
    }
    fun lambdaNonLocalReturn(){
        listOf(1,2,3).forEach{
            if(it == 3){
                return
            }
            println(it)
        }
        println("un reachable code ")
    }

    fun lambdaLocalReturn(){
        listOf(1,2,3).forEach lit@ {
            if(it == 3) {
                return@lit
            }
            println(it)
        }
        println("outside lambda - inside function")
    }

    fun lambdaLocalReturnImplicitLabel(){
        listOf(1,2,3).forEach {
            if(it == 3) {
                return@forEach
            }
            println(it)
        }
        println("outside lambda - inside function")
    }

    fun lambdaLocalReturnAnonFunc(){
        listOf(1,2,3).forEach(fun(it){
            if(it == 3){
                return
            }
            println(it)
        })
        println("outside for each")
    }


}