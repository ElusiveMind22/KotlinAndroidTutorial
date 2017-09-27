
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Enum Classes in Kotlin
 */

package hello

enum class CompassDirection {
    EAST,
    WEST,
    SOUTH,
    NORTH
}

enum class Color(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0,0,255)
}
class Person {
    var hairColor: Color = Color.BLUE
}
//Lam sau cung
enum class ActionState {
    ACTIVE {
        override fun reverseAction() = INACTIVE
    },

    INACTIVE {
        override fun reverseAction() = ACTIVE
    };
    abstract fun reverseAction(): ActionState
}

fun main(args: Array<String>) {
    println("North enum = ${CompassDirection.NORTH}")
    println(Color.BLUE.toString())
    println("Color details.Name = ${Color.GREEN.name}, ordinal : ${Color.GREEN.ordinal}") // Giai thich ve ordinal
    println(Color.valueOf("BLUE"))
//    println(Color.valueOf("BLUE123"))
    for (colorValue in Color.values()) {
        println("color value is : $colorValue")
    }
    println(ActionState.ACTIVE.reverseAction())
    println(ActionState.INACTIVE.reverseAction())
}


