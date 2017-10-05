
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Calling Kotlin from Java
 */
@file:JvmName("hello")
@file:JvmMultifileClass
package hello


class Person(val firstName: String, val lastName: String, var age: Int?){
    private var fullName = "$firstName $lastName"
    //initializer blocks
    init {
        println("Initialized with firstName: $this.firstName, lastName: $lastName, age: $age")
    }
    fun talk(message: String = "") {
        println("$firstName $lastName says $message")
    }
    //Make field in Java
    @JvmField val creditCardNumber:String = "123456789"
}

class Calculation() {
    lateinit var aRandomString: String
    companion object {
        @JvmField
        var PI = 3.1416F
        const val VERSION = 10
        @JvmStatic fun aStaticFunction() {
            println("This is a static function in Kotlin")

        }

    }


}

//function with default parameters
@JvmOverloads fun f(a: String, b: Int = 0, c: String = "abc") {
    println("This is function with default parameters. a = $a, b = $b, c = $c")
}


