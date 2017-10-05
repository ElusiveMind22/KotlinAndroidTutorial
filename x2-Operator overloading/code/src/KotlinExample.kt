
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Operator overloading in Kotlin
 */

package hello
class Point(var x: Int, var y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.inc() = Point(2 * x,   2 * y)

fun main(args: Array<String>) {

}


