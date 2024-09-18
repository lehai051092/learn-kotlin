fun main() {
    /**
     * Use Elvis operator
     */
    val nullString: String? = null
    println(nullString?.length ?: 0)
}