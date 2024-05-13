package leetcodeprac
fun main() {
//      AddDigitsLC258().getDigits(0).let { println(it) }
    AddDigitsLC258().getDigitsSum(38).let{
        println(it)
    }
}
class AddDigitsLC258 {

    fun getDigits(num:Int):List<Int>{
        if(num == 0)
            return listOf(0)
        var inputNumber = num
        val digitsListoutput = mutableListOf<Int>()
        while(inputNumber > 0){
            val currentDigit = inputNumber % 10
            inputNumber = inputNumber / 10
            digitsListoutput.add(currentDigit)
        }
        return digitsListoutput.reversed()
    }
    fun getDigitsSum(num:Int):Int{
        var sum = 0
        var digitsList = getDigits(num)
        digitsList.forEach {
            sum+=it

        }
        while(true){
            digitsList = getDigits(sum)
            if(digitsList.size == 1)
                break
            else {
                sum = 0
                digitsList.forEach {
                    sum += it

                }
            }
        }
    return sum
    }
}