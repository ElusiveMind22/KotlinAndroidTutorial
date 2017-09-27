
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Nested and Inner Classes in Kotlin
 */

package hello

class Fruit {
    private var watermelon: String = "🍉"
    private var grapes: String = "️🍇"
    private var greenApple: String = "🍏🍏️"
    class Nested {
        fun sayHello() {
            //grapes //cannot access to "grapes"
            println("I am a function inside a NESTED class")
        }
    }
    inner class Inner {
        fun getAppleEmoji():String {
            println("I am a function inside a INNER class")
            println("apple emoji is $greenApple")
            return greenApple
        }
    }
}

fun main(args: Array<String>) {
    Fruit.Nested().sayHello()
    val fruit = Fruit()
    var innerFruit = fruit.Inner()
    innerFruit.getAppleEmoji()
}


