
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Lambda Expressions and Anonymous Functions in Kotlin
 */

package hello


//fun sum(x: Double, y: Double): Double {
//    return x + y
//}

//val sum = { x: Double, y: Double -> x + y }
val sum: (Double, Double) -> Double = { x, y -> x + y }

//fun sayHello(personName: String) {
//    println("This is an anonymous function")
//    println("Hello $personName")
//}

val sayHello = fun(personName: String) {
    println("This is an anonymous function")
    println("Hello $personName")
}

fun main(args: Array<String>) {
    sum(10.2, 11.3)
    sayHello("Hoang")

    var doubles = doubleArrayOf(10.0, 11.1, 12.2, 13.3, 14.4)
    doubles.forEach { eachNumber -> println(eachNumber) }
}
