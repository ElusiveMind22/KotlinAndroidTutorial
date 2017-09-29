
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Observable properties and storing properties in a Map (Kotlin)
 */

package hello
import kotlin.properties.Delegates

class User(name: String) {
    var currentAddress: String by Delegates.observable("no address")  {
        prop, oldAddress, newAddress -> run {
            println("Address is changing")
            println("From $oldAddress -> $newAddress")
            println("property's name = ${prop.name}")
        }
    }
}
//Storing Properties in a Map = like to "store in a json with key-value pairs"
var userObject = mutableMapOf<String, Any?>("name" to "Duc Hoang",
                                                    "age"  to 35)

class Customer(val mapObject: Map<String, Any?>) {
    val name: String by mapObject
    val age: Int     by mapObject
}

fun main(args: Array<String>) {
    val user = User("Nguyen Duc Hoang")
    user.currentAddress = "1234 Penn Avenue\n" +
                           "Pittsburgh, PA 15206\n" +
                            "United States"
    user.currentAddress = "Bach Mai street, Hanoi, Vietnam"
    println("User's details. Name = ${userObject.getValue("name")}. age = ${userObject.getValue("age")}")
    userObject.set("age", 40)
    println("User's details. Name = ${userObject.getValue("name")}. age = ${userObject.getValue("age")}")
    val customer = Customer(mapOf(
            "name" to "John Lasseter",
            "age"  to 30
    ))
    println("Customer's details. Name = ${customer.name}, age = ${customer.age}")
}



