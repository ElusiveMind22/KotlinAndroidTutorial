
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 */

package hello


fun main(args: Array<String>) {
    //if clause
    var a: Double = 6.2
    var b: Double = 5.2
    if (a >= b) {
        println("a is larger than equal b")
    } else {
        println("a is smaller than equal b")
    }
    var aString = if (a >= b) "large" else "smaller"
    println("aString = $aString")
    //"when" as a variable
    var c: Char = 'a'
    var stringResult: String = when(c) {
        'a' -> "First character of the alphabet"
        'z' -> "Last character of the alphabet"
        else -> "other character"
    }
    println("stringResult = $stringResult")
    //Use "when" as a function
    fun checkNumber(inputNumber: Int) = when(inputNumber) {
        0 -> {
            println("do something...")
            println("this is zero")
        }
        1,2 -> {
            print("one or two")
        }
        in 3..10 -> print("a few, several")
        else -> println("many")
    }
    checkNumber(9)
    //for loop
    val intNumbers: Array<Int> = arrayOf(11, 22, 43, 55)
    println("for loop")
    for (intNumber in intNumbers) {
        println("intNumber = $intNumber")
    }
    println("using indices")
    for (index in intNumbers.indices) {
        println("Value at index = $index is ${intNumbers[index]}")
    }
    //using index, value pair
    println("using index, value pair")
    for ((index, value) in intNumbers.withIndex()) {
        println("Value at index = $index is $value")
    }
    var x: Long = 10
    while (x > 0) {
        x--
        println("x = $x")
    }
}