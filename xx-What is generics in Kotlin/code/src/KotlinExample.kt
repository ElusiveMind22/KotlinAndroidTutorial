
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Generics in Kotlin
 */

package hello



class Box<T>(inputParam: T) {
    var param = inputParam
    fun showParam() {
        println("inputParam = $param")
    }
}
//Comparable is an interface
fun compare2Numbers(x: Comparable<Number>, y: Number) {
    //Number's type can be Double, Int, Float
    if (x.compareTo(y) > 0) {
        println("x > y")
    } else if (x.compareTo(y) == 0) {
        println("x = y")
    } else {
        println("x < y")
    }
}
fun main(args: Array<String>) {
    val myBox = Box("hello. This is a string")
    myBox.showParam()

    val myBox2 = Box(100)
    myBox2.showParam()

    val myBox3 = Box(123.0F)
    myBox3.showParam()

    compare2Numbers(10,20.0)
    var x = 10
    var y = 20
    x.compareTo(y)


}

