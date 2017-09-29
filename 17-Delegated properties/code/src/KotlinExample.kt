
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Object Expressions and Declarations in Kotlin
 */

package hello
class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // Works
        val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }
}

fun main(args: Array<String>) {
    //Object expressions
    val point = object {
        var x: Double = 0.0
        var y: Double = 0.0
    }
    //type of point "anonymous object type"
    print(point.x + point.y)

}


