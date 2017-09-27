
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Data classes in Kotlin
 */

package hello
//"Data class" => purpose is to hold data
data class User(var name: String, var age: Int) {

}


fun main(args: Array<String>) {
    var user = User(name = "Test Name", age = 18)
    println(user.toString())
    var backupUser = user.copy()
    user.age = 30
    println("After copy")
    println(user.toString())
    println(backupUser.toString())

    //Memory location = "hashCode"
    println(backupUser.hashCode())
    println(user.hashCode())

//    if (user.equals(backupUser)) {
    if (user.hashCode() == backupUser.hashCode()) {
        println("2 objects are the same")
    } else {
        println("2 objects are NOT the same")
    }

}

