/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Companion object = "static property / function"
 */
class Calculation {
    companion object {
        fun PI() : Float = 3.1416F
    }
}
//Extensions with companion
fun Calculation.Companion.doublePI() : Float {
    return 2 * Calculation.Companion.PI()
}