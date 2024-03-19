package kotlinprac
fun main() {
//    NumbersPrac().byteToInt()
//    StringPrac().immutableString("karan")
//    StringFormatPrac().getSevenDigitNumber()
//    StringFormatPrac().getFourDecimals()
//    StringFormatPrac().displayNumberParenthesis()
//    StringFormatPrac().stringFormatArgumentIndex()
//    ArrayPrac().createObjectTypeArray()
//      ArrayPrac().addToArray()
//      ArrayPrac().createArrayArrayOf()
//      ArrayPrac().createArrayArrayOfNull()
//      ArrayPrac().createArrayEmptyArray()
        ArrayPrac().createArrayConstructor()
}

class NumbersPrac {
    //small types are implicitly not converted to big types
    fun byteToInt() {
        val b: Byte = 1
        val c: Int = b.toInt()
        println(c)
    }
}

class StringPrac {
    fun immutableString(inputString:String){
        println(inputString.uppercase())
        println(inputString)
    }
}

class StringFormatPrac {
    fun getSevenDigitNumber(){
        val sevenDigitNumber = String.format("%07d",31416)
        println(sevenDigitNumber)
    }
    fun getFourDecimals(){
        val fourDecimalsNumber = String.format("%+.4f",3.141592)
        println(fourDecimalsNumber)
    }
    fun displayNumberParenthesis(){
        val negativeNumberInParenthesis = String.format("%(d means %1\$d",-31416)
        println(negativeNumberInParenthesis)
    }

    fun stringFormatArgumentIndex(){
        val myNumber = String.format("%d and %1\$d",999)
        println(myNumber)
    }



}
class ArrayPrac{
    fun createObjectTypeArray(){
        val myArray = arrayOf<Any>()
        println(myArray.size)
    }

    fun addToArray(){
        var riversArray = arrayOf("Nile","Amazon","Yangtze")
        riversArray += "Missisipi"
        println(riversArray.joinToString())
    }

    fun createArrayArrayOf(){
        val myArray = arrayOf(1,2,3)
        println(myArray.joinToString())
    }
    fun createArrayArrayOfNull(){
        val myArray = arrayOfNulls<Any>(3)
        println(myArray.joinToString())
    }
    fun createArrayEmptyArray(){
        val myArray = emptyArray<Any>()
        println(myArray.size)

    }
    fun createArrayConstructor(){

    }
}