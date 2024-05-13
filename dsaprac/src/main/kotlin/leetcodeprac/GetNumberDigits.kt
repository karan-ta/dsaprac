package leetcodeprac

fun main() {
    GetNumberDigits().getNumberDigits(333562).let { println(it) }
}
class GetNumberDigits {
    fun getNumberDigits(num:Int):List<Int>{
        var inputNumber = num
        val digitsListoutput = mutableListOf<Int>()
        while(inputNumber > 0){
            val currentDigit = inputNumber % 10
            inputNumber = inputNumber / 10
            digitsListoutput.add(currentDigit)
        }
        return digitsListoutput.reversed()
    }
}