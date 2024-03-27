package kotlinprac

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

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
//        ArrayPrac().createArrayConstructor()
//        ArrayPrac().createArrayConstructorFunction()
//    ArrayPrac().createTwoDimensionalArray()
//      ArrayPrac().printVarargStrings()
//      ArrayPrac().arrayEquals()
//      ArrayPrac().sumArray()
//        ArrayPrac().shuffleArray()
//        ArrayPrac().arrayToList()
//        ArrayPrac().arrayToSet()
//        ArrayPrac().arrayToMap()
//      SmartCastPrac().smartCastDemo("karan")
//    SmartCastPrac().smartCastWhenDemo(10)
//    SmartCastPrac().smartCastWhenDemo("karan")
//    SmartCastPrac().smartCastWhenDemo(intArrayOf(1,2,3,4,5))
//      println(DelegateProperty().p)
//      DelegateProperty().p = "karan"
//       val lazyProperty = LazyDelegateProperty()
    //lambda of lazy will be called then value will be returned
//       println(lazyProperty.p)
//       println("------------------------")
    //lambda already called above , so only value will be returned.
//       println(lazyProperty.p)
//    val dello = DelegatesObservables()
//    println(dello.name)
//    dello.name = "karan"
//    println(dello.name)
//    UnsafeCastOperator().unsafeCast(null)
//    UnsafeCastOperator().unsafeCast(42)
//    UnsafeCastOperator().unsafeCast("karan")
//      ConditionalsDemo().getMax()
//      ConditionalsDemo().whenDemo()
//      ConditionalsDemo().whenEnumDemo()
//      ConditionalsDemo().whenMultipleCases(5)
        ConditionalsDemo().whenInDemo(10)

}
enum class Bit {
    ZERO, ONE
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
        val myArray = Array<Int>(3){0}
        println(myArray.joinToString())
    }
    fun createArrayConstructorFunction(){
        val myArray = Array(5){i -> (i*i).toString()}
        println(myArray.joinToString ())
    }

    fun createTwoDimensionalArray(){
        val myArray = Array(2){Array(2){0} }
        println(myArray.contentDeepToString())
    }

    //arrays are invariant
    fun invariantArrayTest(){
        val myAnyArray:Array<Any>
        val myStringArray:Array<String> = arrayOf()
//        myAnyArray = myStringArray
    }

    fun printAllStrings(vararg strings:String){
        for (myString in strings){
            println(myString)
        }
    }

    fun printVarargStrings(){
        val lettersArray = arrayOf("c", "d")
        printAllStrings("a","b",*lettersArray)
    }

    fun arrayEquals(){
        val array1 = intArrayOf(1,2,3)
        val array2 = intArrayOf(1,2,3)
        println(array1.contentEquals(array2))
        println(array1 contentEquals array2)
        array2[1] = 0
        println(array1 contentEquals array2
        )
    }

    fun sumArray(){
        val myArray = intArrayOf(1,2,3)
        println(myArray.sum())
    }

    fun shuffleArray(){
        val myArray = intArrayOf(1,2,3)
        myArray.shuffle()
        println(myArray)
    }

    fun arrayToList(){
        val lettersArray = arrayOf("c", "d","c")
        println(lettersArray.toList())

    }
    fun arrayToSet(){
        val lettersArray = arrayOf("c", "d","c")
        println(lettersArray.toSet())
    }

    fun arrayToMap(){
        val persons = arrayOf("karan" to 40,"priya" to 36, "vihaan" to 7)
        println(persons.toMap())
    }

    fun isOperatorTest(){
        val stringsArray = arrayOf("a","b","c")
        for(elem in stringsArray){
            if(elem is String)
                println("$elem is a string")
            else
                println("$elem ")
        }
    }

}

class SmartCastPrac{
    fun smartCastDemo(x:Any){
        //below will not compile - unresolved refrence length - Any does not have length property
//        println(x.length)
        //compiler will track the is check below and will cast x to a string
        if(x is String){
            println(x.length)
        }
    }
    fun smartCastWhenDemo(x:Any){
        when(x){
            is Int -> println(x+1)
            is String -> println(x.length + 1)
            is IntArray -> println(x.sum())
        }
    }
}

class DelegateProperty {
    var p:String by MyDelegateClass()
}

class MyDelegateClass{
    operator fun getValue(delegateProperty: DelegateProperty, property: KProperty<*>): String {
        return "Thank you for calling get value"
    }

    operator fun setValue(delegateProperty: DelegateProperty, property: KProperty<*>, s: String) {
        println("Thank you for calling set value")
    }
}
class LazyDelegateProperty {
    val p:String by lazy{
        println("calling lambda of lazy delegate")
        "Hello"
    }
}

class DelegatesObservables{
    var name:String by Delegates.observable("mrtechmaker") {
        prop,oldValue, newValue -> println("set value of delegates observables property")
    }
}

class UnsafeCastOperator{
    fun unsafeCast(x:Any?){
        println(x as? String)
    }
}

class ConditionalsDemo{
    fun getMax(){

        val a = 10
        val b = 20
        val max = if(a > b) a else b
        println(max)
    }
    //last line of block is the return value
    fun getMaxBlock(){
        val a = 10
        val b = 20
        val max = if(a > b){
            println("a is greater")
            a
        }
        else{
            println("b is greater")
            b
        }
        println(max)
    }
    fun whenDemo(){
        val x = 1
        when(x){
            1 -> println("x == 1")
            2 -> println("x == 2")
            else -> println("x is neither 1 nor 2")
        }
    }

    fun getRandomBit():Bit{
        return Bit.ZERO
    }
    fun whenEnumDemo(){
        val numericValue = when (getRandomBit()) {
            Bit.ZERO -> 0
            Bit.ONE -> 1
            // 'else' is not required because all cases are covered

        }
        println(numericValue)
    }
    fun whenMultipleCases(num:Int){
        when(num){
            0,2,4 -> println("number is even")
            1,3,5 -> println("number is odd")
        }
    }

    fun whenInDemo(num:Int){
        when(num){
            in 1..10 -> println("number is between 1 to 10")
            in 10..20 -> println("number is between 10 to 20")
            else -> println("number is not between 1 to 20")
        }
    }

    fun whenIsDemo(param:Any?){
         val output = when(param){
             is String -> param.startsWith("K")
             is Int -> param
             else -> "not string or int"
         }
        println(output)

    }

}
