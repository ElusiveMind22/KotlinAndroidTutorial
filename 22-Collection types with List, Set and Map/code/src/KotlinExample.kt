
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
    println(numbers)
    println("readOnlyNumbers = $readOnlyNumbers")
//    readOnlyNumbers.add()
    val strings = mutableSetOf("a", "b", "c", "d")
    if (strings.contains("b")) {
        println("this set contains b")
    } else {
        println("this set not contains b")
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
    println("list = ${listWithNullElement}")
//    listWithNullElement.requireNoNulls()
    var mutableHashMap = mutableMapOf<String, Int>("x" to 1, "y" to 2)
//    mutableHashMap["x"] = 100
    mutableHashMap.set("x", 100)
    println("mutableHashMap = $mutableHashMap")

}


