package leetcodeprac

fun main() {
    HappyNumber().getHappyNumber(114542).let { println(it) }
}
class HappyNumber {
    lateinit var digitsList:MutableList<Int>
    fun getDigits(inputNumber:Int){
        if(inputNumber == 0)
            return
        val rightmostDigit = inputNumber % 10
        digitsList.add(rightmostDigit)
        getDigits(inputNumber / 10)

    }

    fun getSumOfSquares():Int{
        var sumAnswer = 0
        for(currentNumber in digitsList){
            sumAnswer += currentNumber * currentNumber
        }
        return sumAnswer
    }
    fun getHappyNumber(inputNumber:Int):Boolean{
        digitsList = mutableListOf()
        getDigits(inputNumber)
        digitsList.forEach{
            println(it)
        }
        val sumOfSquares = getSumOfSquares()
//        if(sumOfSquares == 1)
            return true
//        else
//            getHappyNumber(sumOfSquares)
//        return true
    }
}