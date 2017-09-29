
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Higher-order function in Kotlin
 */

package hello
//Higher-order function = function that takes functions as parameters, or returns a function

import java.util.*

class Lock {
    fun lock() {
        println("I locked the process")
    }
    fun unlock() {
        println("I unlocked the process")
    }
}

var bodyFunction = fun():Int {
    val taskId = Random().nextInt()
    println("This is the body function. TaskId = $taskId")
    return taskId
}

fun doATask(lock: Lock, body: () -> Int): Int {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

//function that takes functions as parameters, returns a value
val compare: (Int, Int) -> Boolean = { x, y -> x < y }
fun getMaxValueInCollection(collection: Collection<Int>, less: (Int, Int) -> Boolean): Int? {
    var maxValue: Int? = null
    for (item in collection)
        if (maxValue == null || less(maxValue, item))
            maxValue = item
    return maxValue
}

fun main(args: Array<String>) {
    //function that takes functions as parameters, returns a function
    doATask(Lock(), bodyFunction)
    var ints:Collection<Int> = listOf(1, 2, 3, 4, 10, 6)
    var maxValue = getMaxValueInCollection(ints, compare)
    println("maxValue = $maxValue")
}


