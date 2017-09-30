
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Destructuring Declaration in Kotlin
 */

package hello

//Destructuring Declaration only work with "data class"
data class Customer(var name: String, val age: Int) {

}
//Functions that return multiple values
data class Result(val x: Int, val y: Int, val z: Int)
fun calculateVector(): Result {
    //calculations
    return Result(1, 2, 3)
}

fun main(args: Array<String>) {
    var customer = Customer("Duc Hoang", 35)
    var (name, age) = customer
    //var (_, age) = customer
    println("Name = $name, age = $age")

    var customer2 = Customer("Alex", 20)
    var customers = listOf<Customer>(customer, customer2)
    for ((name, age) in customers) {
        println("Name = $name, age = $age")
    }

    val (x, y, z) = hello.calculateVector()
    println("x = $x, y = $y, z = $z,")
    //Map
    var userObject = mapOf<String, Any?>("name" to "Alexander", "age" to 40)
    for ((key, value) in userObject) {
        println("key = $key, value = $value")
    }
}


