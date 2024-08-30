/**
 *  Function uses a safe call to return either the length of the string or null
 */
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    /**
     * Use safe calls
     */
    val nullString: String? = null
    println(lengthString(nullString))

    // nullString is null so the invocation of .uppercase() is skipped and null is returned
    println(nullString?.uppercase())
}