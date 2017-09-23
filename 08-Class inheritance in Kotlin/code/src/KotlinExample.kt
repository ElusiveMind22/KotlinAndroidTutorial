
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Functions in Kotlin
 */

package hello
//class Person constructor(val firstName: String, val lastName: String, var age: Int?){
class Person(val firstName: String, val lastName: String, var age: Int?){
    private var fullName = "$firstName $lastName"
    //initializer blocks
    init {
        println("Initialized with firstName: $this.firstName, lastName: $lastName, age: $age")
    }
    fun talk(message: String = "") {
//        println("$fullName says $message")
        println("$firstName $lastName says $message")
    }
}

fun main(args: Array<String>) {
//    var person = Person(firstName = "Nguyen", lastName = "Duc Hoang", age = null)
//    println("Function details. Firstname = ${person.firstName}, lastName = ${person.lastName}")
    var person = Person(firstName = "Nguyen", lastName = "Duc Hoang", age = 35)
    println("Function details. Firstname = ${person.firstName}, lastName = ${person.lastName}, age = ${person.age}")
    //person.fullName
    person.talk("Good morning")
}