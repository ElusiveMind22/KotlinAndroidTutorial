
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Functions in Kotlin
 */

package hello

fun main(args: Array<String>) {

    fun addTwoInts(x: Int, y: Int): Int {
        return x + y
    }

    //fun addTwoInts(x: Int, y: Int): Int = x + y
    println("add 2 numbers = ${addTwoInts(10,20)}")
    //    fun areaOfRectangle(width: Double, height: Double = width): Double {
    fun areaOfRectangle(width: Double, height: Double = 123.0): Double {
        return width * height
    }
    println("areaOfRectangle = ${areaOfRectangle(10.0,20.0)}")
    println("areaOfRectangle = ${areaOfRectangle(10.0)}")
//    fun greet(personName: String?) {
    fun greet(personName: String?) : Unit {
    if (personName != null)
            println("Hello ${personName} !")
        else
            println("Hi there!")
    }
    greet("Nguyen Duc Hoang")
    //Varargs = Variable number of arguments
    fun functionA(vararg intParams: Int) {
        for (eachParam in intParams) {
            println("each Param : $eachParam")
        }
    }
    functionA(1,2,7,8)
    println("relaxing..")
    functionA(25)
    //    Infix notation
    infix fun Int.plus(x: Int): Int {
        return this + x
    }
    println("3 + 2 = ${3 plus 2}")
    tailrec fun factorial(n: Long = 1): Long {
        if (n == 1L) {
            return 1
        } else {
            return n * factorial(n-1)
        }
    }
    println("factorial of 5 is: ${factorial(1000)}")

}