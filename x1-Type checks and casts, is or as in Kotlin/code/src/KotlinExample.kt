
/**
 * Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Type Checks and Casts: 'is' and 'as' in Kotlin
 */

package hello

fun main(args: Array<String>) {
    val myName = "Nguyen Duc Hoang"
//    val myName = 100
    if (myName is String) {
        println("string length is : ${myName.length}")
    } else {
        println("This is not a string")
    }

    if (myName is String && myName.length > 0) {
        println("This string is not BLANK !")
    }
    if ("hello" !is Int) {
        println("This is not a string")
    }

}


