
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Delegation in Kotlin
 */

package hello

interface BirdInterface {
    fun flyAndFindFood()
}

class Eagle(val age: Int) : BirdInterface {
    override fun flyAndFindFood() {
        println("I am an eager. I am $age years old. I am flying and finding food")
    }
}

//class Derived(b: BirdInterface) : BirdInterface by b
class Cuckoo(b: BirdInterface): BirdInterface by b {
    override fun flyAndFindFood() {
        println("I am a Cuckoo. I am flying and finding food")
    }
}


fun main(args: Array<String>) {
    val eagle = Eagle(2)
    eagle.flyAndFindFood()
    val cuckoo = Cuckoo(eagle)
    cuckoo.flyAndFindFood()
}


