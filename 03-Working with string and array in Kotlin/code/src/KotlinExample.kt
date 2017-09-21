
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 */

package hello

import java.util.function.DoubleBinaryOperator

fun main(args: Array<String>) {
    //Characters or Char
    var c:Char = 'c'
    //@ 	COMMERCIAL AT (U+0040)
    c = '\u0040'
    println("copyright char = $c")
    val myName = "Hoang"
    for (eachChar in myName) {
        println("eachChar = $eachChar")
    }
    val strings: Array<String> = arrayOf("a", "b", "c", "d")
    for (string in strings) {
        println("string = $string")
    }
    val intNumbers:Array<Int> = Array<Int>(5, { i -> 2 * i })
    for (intNumber in intNumbers) {
        println("intNumber = $intNumber")
    }
    val text = """
    | These are my tutorial videos in Kotlin
    |My name is Nguyen duc Hoang
    |My email: sunlight4d@gmail.com
    |Youtube channel: https://www.youtube.com/c/nguyenduchoang
    """.trimMargin("|")
    println("text = $text")









    /*
    //Lesson 02
    println("Hello world")
    val x: Double = 3.156
    //x = 5.23
    println("x = $x")
    val creditCardNumber = 1234_456_789_1011L
    println("creditCardNumber = $creditCardNumber")
    val aNullableInt: Int?
    aNullableInt = 20
    println("aNullableInt = $aNullableInt")
    //    Explicit Conversions
    val anInt: Int? = 123
    val aLong: Long? = anInt?.toLong()
    println("aLong = $aLong")

    var aConvertedFloat:Float = "123.56".toFloat()
    println("aConvertedFloat = $aConvertedFloat")
    var a: Double = 0.0
    var b: Double = -0.0
    if (a == b) {
        println("a is equal to b")
    }
    var z: Double = 10.0
    var a1:Double = z
    var b1:Double = z
    if (a1 === b1) {
        println("a1 is identical to b1")
    }
    //    Boolean
    val aTrueValue = (100 > 99) && (2 > 1)
    println("aTrueValue = $aTrueValue")

    val aTrueValue2 = (100 > 99) || (10 > 100)
    println("aTrueValue2 = $aTrueValue2")
    */
}
