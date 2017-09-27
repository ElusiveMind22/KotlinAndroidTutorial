
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Method Extensions = "Add more methods to an existing class"
 */

fun <T> MutableList<T>.swap2Elements(index1: Int, index2: Int) {
//fun MutableList<String>.swap2Elements(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}