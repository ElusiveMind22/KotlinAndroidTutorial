
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Type aliases in Kotlin
 */

package hello
//type aliases is upper camel case
typealias IntSet = Set<Int>
typealias StringMap<K> = MutableMap<K, String?>

class A {
    inner class X {
        init {
            println("This is class X of A")
        }
    }
}
class B {
    inner class X
    init {
        println("This is class X of B")
    }
}

typealias XofA = A.X
typealias XofB = B.X

typealias Predicate<T> = (T) -> Boolean

fun main(args: Array<String>) {
//    var stringMaps: MutableMap<String, String?> = mutableMapOf<String, String?>("k1" to "value1", "k2" to "value2", "k3" to "value3")
    var stringMaps: StringMap<String> = mutableMapOf<String, String?>("k1" to "value1", "k2" to "value2", "k3" to "value3")
    println("stringMaps = $stringMaps")
    val xOfA = A().XofA()

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1,-2,5,6,-7,9,-8).filter(p))
}


