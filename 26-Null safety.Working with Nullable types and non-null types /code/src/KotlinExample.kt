
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * This Expression in Kotlin
 */

package hello
class A { // label =  @A
    inner class B { // label = @B
        fun Int.foo() { // label = @foo
            val a = this@A // A's this
            val b = this@B // B's this
            println("b = $b")

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }

    }
}

fun main(args: Array<String>) {
    var aObject = A()
    aObject.B().
}


