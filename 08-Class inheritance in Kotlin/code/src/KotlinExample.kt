
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Functions in Kotlin
 */

package hello
//class Person constructor(val firstName: String, val lastName: String, var age: Int?){
open class Person(open val firstName: String, val lastName: String, var age: Int?){
    private var fullName = "$firstName $lastName"
    //initializer blocks
    init {
        println("Initialized with firstName: $this.firstName, lastName: $lastName, age: $age")
    }
    open fun talk(message: String = "") {
        println("$fullName says $message")
    }
}

class Engineer(fieldOfStudy: String, firstName: String, lastName: String, age: Int?): Person(firstName, lastName, age) {
    override val firstName = super.firstName.toUpperCase()
    override fun talk(message: String) {
        super.talk(message)
        println("I am an engineer")
    }

}

fun main(args: Array<String>) {
    /*
    var person = Person(firstName = "Nguyen", lastName = "Duc Hoang", age = 35)
    println("Details. Firstname = ${person.firstName}, lastName = ${person.lastName}, age = ${person.age}")
    person.talk("Good morning")
    */
    var engineer = Engineer("mechanics", firstName = "Alan", lastName = "Turing", age = 40)
    engineer.talk("Good afternoon")
    println("Details. Firstname = ${engineer.firstName}, lastName = ${engineer.lastName}, age = ${engineer.age}")



}