
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Collection types(List, Set, Map) in Kotlin
 */

package hello

fun main(args: Array<String>) {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyNumbers: List<Int> = numbers
    println(numbers)
    numbers.add(4)

    println(readOnlyNumbers)
//    readOnlyNumbers.add
    //readOnlyNumbers.clear()

    val strings = mutableSetOf("a", "b", "c", "d")
    if (strings.contains("g")) {
        println("this set contains g")
    } else {
        println("this set not contains g")
    }
    println(strings)
    println(strings.sortedDescending())
    //Take snapshot of a collection at a particular point in time
    val floatMutableList: MutableList<Float> = mutableListOf(1.0F, 2.0F, 3.0F)
    val backupfloatList: List<Float> = floatMutableList.toList()
    floatMutableList.add(4.0F)
    println("floatMutableList = $floatMutableList")
    println("backupfloatList = $backupfloatList")

    println("first element of floatMutableList = ${floatMutableList.first()}")
    println("last element of floatMutableList = ${floatMutableList.last()}")

    println("Filter of floatMutableList with value > 2.0 =>  ${floatMutableList.filter {item -> item > 2.0F }}")
    val listWithNullElement:MutableList<Int?> = mutableListOf(1, 2, null, 3, 4)
    println("Remove null elements, list = ${listWithNullElement}")
    //println("Remove null elements, list = ${listWithNullElement.requireNoNulls()}")
//    var mutableHashMap = hashMapOf("x" to 1, "y" to 2)
    var mutableHashMap = mutableMapOf<String, Int>("x" to 1, "y" to 2)
//    mutableHashMap["x"] = 10
    mutableHashMap.set("x", 10)
    println("mutableHashMap = $mutableHashMap")

}


