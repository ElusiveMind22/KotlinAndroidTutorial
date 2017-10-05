
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Calling Java from Kotlin
 */

package hello
import java.util.*

class Person(var name: String) : Cloneable {
    public override fun clone(): Any {
        var newObject = Person(this.name)
        return newObject
    }
}

fun main(args: Array<String>) {
    val list:List<Int> = Arrays.asList(1,2,3,4,5)
    val arrayList = ArrayList<Int>()
    //for..loop like in Java
    for (item in list) {
        arrayList.add(item)
    }
    for (i in 0..list.size - 1) {
        arrayList[i] = list[i] // get and set are called
    }

    val calendar = Calendar.getInstance()
    println("First day of week : ${calendar.getFirstDayOfWeek()}")
    println("First day of week : ${calendar.firstDayOfWeek}")
    //Types of Java in Kotlin as "platform types"
    val firstItem = list[0]
    //Use Object in Java ?
    //Eg:wait() and notify()
//    (firstItem as java.lang.Object).notify()

    val person = Person("Hoang")
    val clonedPerson = person.clone()
    println("person = $person")
    println("clonedPerson = $clonedPerson")


}



