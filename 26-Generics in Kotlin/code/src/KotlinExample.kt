
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 *  in Kotlin
 */

package hello

class Box<T>(inputType: T) {
    init {
        println("input type's value = $inputType")
    }
}

fun main(args: Array<String>) {
    var intBox = Box<Int>(120)
    var stringBox = Box<String>("hello, how are you")

    val integer: Int = 1
    val number: Number = integer //ok because Int is a subtype of Number

}


