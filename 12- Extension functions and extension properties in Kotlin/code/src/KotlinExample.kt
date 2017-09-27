
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Extensions(method and property) in Kotlin
 */

package hello

import doublePI
import swap2Elements

class A {
    fun methodA() {
        println("method A of class A")
    }

    fun methodX() {
        println("method X of class A")
    }
    fun B.methodB2() {
        methodA()
        this.methodB()
//        methodX()
        this@A.methodX()
    }
    fun callB2FromA(b: B) {
        b.methodB2()
    }
}
class B {
    fun methodB() {
        println("method B of class B")
    }
    fun methodX() {
        println("method X of class B")
    }
}
fun main(args: Array<String>) {
    val listOfStrings:MutableList<String> = mutableListOf("Zero", "One", "Two", "Three", "Four")
    listOfStrings.swap2Elements(0, 3)
    println("listOfStrings = $listOfStrings")
    println("pi = ${Calculation.PI()}")
    println(" 2 * pi = ${Calculation.doublePI()}")
    var b = B()
//    b.methodB2()
    val a = A()
    a.callB2FromA(b)
}

