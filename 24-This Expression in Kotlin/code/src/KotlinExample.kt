
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * This Expression in Kotlin
 */

package hello
class C {

}

class A { // label =  @A
    inner class B { // label = @B
        fun C.extendingFunction1() {
            val thisAtA = this@A
            println("thisAtA = $thisAtA")

            val thisAtB = this@B
            println("thisAtB = $thisAtB")

            val thisAtExtendingFunction1 = this@extendingFunction1
            println("thisAtExtendingFunction1 = $thisAtExtendingFunction1")

            val thisAtHere = this
            println("thisAtHere = $thisAtHere")

            val noNameFunction = fun() {
                val thisAtNoname = this
                println("thisAtNoname = $thisAtNoname")
            }
            noNameFunction()

            val lambdaFunction = { s: String ->
                val thisAtLambda = this
                println("thisAtLambda = $thisAtLambda")
            }
            lambdaFunction("this is a string")
        }
        fun methodOfClassB() {
            var cObject = C()
            cObject.extendingFunction1()
            
        }
    }

}

fun main(args: Array<String>) {
    var objectA = A()
    objectA.B().methodOfClassB()
}


