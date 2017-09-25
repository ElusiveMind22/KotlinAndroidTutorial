
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Interfaces in Kotlin
 */

package hello
class Bat: AnimalInterface, BirdInterface {
    override fun walk() {
        super.walk()
        println("I am a bat. I can walk")
    }

    override fun fly() {
        super.fly()
        println("I am a bat. I can fly")
    }

    override fun eat() {
        super<BirdInterface>.eat()
        super<AnimalInterface>.eat()
        print("I am a bat. I can eat")
    }
}

fun main(args: Array<String>) {
    var bat: Bat = Bat()
    bat.walk()
    bat.fly()
    bat.eat()
}