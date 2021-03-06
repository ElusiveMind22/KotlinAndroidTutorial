
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Ranges in Kotlin
 */

package hello

fun main(args: Array<String>) {
    for (i in 1..10) {
        print("$i, ")
    }
    println("from 10 down to 1")
    for (i in 10 downTo 1) {
        print("$i, ")
    }
    println("from 1 to 9")
    for (i in 1 until 10) {
        print("$i, ")
    }

    val ints = listOf<Int>(10, 20, 30, 40, 50, 60)
    if (30 !in ints) {
        println("This number not exist in the list")
    } else {
        println("This number exist in the list")
    }
    //step
    for (i in 0..20 step 3) {
        print("$i, ")
    }
    println("downTo with step")
    for (i in 20 downTo 0 step 2) {
        print("$i, ")
    }
    var filterInts = (1..30 step 2)
    println("filterInts details: ")
    for (filterInt in filterInts) {
        print("$filterInt, ")
    }
    println("filterInts first element: ${filterInts.first}, last element: ${filterInts.last}")
}


