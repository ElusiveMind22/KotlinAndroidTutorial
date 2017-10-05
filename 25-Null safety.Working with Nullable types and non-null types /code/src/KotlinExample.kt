
/**
 *Mr Nguyen Duc Hoang
 * Youtube channel: https://www.youtube.com/c/nguyenduchoang
 * Email: sunlight4d@gmail.com
 * Null Safety in Kotlin
 */

package hello


fun main(args: Array<String>) {
    var aNotNullString: String = "abc"
//    aNotNullString = null
    var aNullableString: String? = "hoang"
//    aNullableString = null
    println("aNullableString = $aNullableString")

//    var len = if (aNullableString != null) aNullableString.length else -1
    //var len = aNullableString?.length ?: -1
    var len = aNullableString!!.length
    println("len = $len")
    val nullableList:List<Int?> = listOf(3, 5, null, 7)
    val intList: List<Int> = nullableList.filterNotNull()
    println("inList = $intList")


}


