
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Coding conventions in Kotlin
 */

package hello
//types start with upper case
open class Person(var name: String) {//Classes with a few arguments can be written in a single line
    //Add doc to public
    /**
     * The person object do a task
     * @property name the name of the person
     * @return successful / unsuccessful
     */
    fun work(): Boolean {
//        use 4 space indentation
        println("I am working now")
        return true
    }
}
//Class with long header
class Employee(
        name: String, // argument is in a separate line
        var surname: String
) : Person(name) { // the closing parenthesis should be on a new line

}

interface Working
class Employer(
        name: String,
        var surname: String
) : Person(name), //constructor first, then interfaces
        Working {

}
//If a function returns Unit, the return type should be omitted:
//fun sayHello(): Unit { // ": Unit" is omitted here
fun sayHello() {
    println("Hello world !")
}
fun main(args: Array<String>) {
//    use of camelCase for names (and avoid underscore in names)
    val person = Person(name = "Hoang")
    var list = listOf<Int>(1, 3, 4 ,6, 7)
    //In lambda expressions, spaces should be used around the curly braces
    list.map { element -> element * 2 }
    list.filter { it -> it > 10 }
    list.filter { it > 10 } //use this for short lambdas


}


