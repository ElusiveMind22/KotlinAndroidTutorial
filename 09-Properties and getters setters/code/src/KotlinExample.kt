
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Properties, getters and setters in Kotlin
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
    //getter and setter
    var isAdult: Boolean
        get() {
            println("Prepare to get isAdult")
            if (age == null) {
                return false
            }else if(age!! > 18) {
                return true
            }
            return false
        }
    //setter
        set(value) {
            println("Prepare to set isAdult")
            age = if (value == true) 18 else null
        }
    lateinit var language: String
}

class Engineer(fieldOfStudy: String, firstName: String, lastName: String, age: Int?): Person(firstName, lastName, age) {
    override val firstName = super.firstName.toUpperCase()
//    final override fun talk(message: String) {
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

    //getters
    println("${engineer.firstName} is an adult ? ${engineer.isAdult}")
    //setter
    engineer.isAdult = false
    if (engineer.age == null) {
        println("age is null")
    }
    engineer.language = "English"
    println("Details. language = ${engineer.language}")

}