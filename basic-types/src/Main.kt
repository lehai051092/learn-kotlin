fun main() {
    var customers = 10

    customers = 8

    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println(customers)

    /**
     * initialized before first read, if you don't initialize a variable before it is read, you see an error
     */

    val d: Int
    d = 3

    val e: String = "hello"
    println(d)
    println(e)

    /**
     * practice
     */
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val dLong: Long = 100_000_000_000_000
    val eBoolean: Boolean = false
    val f: Char = '\n'
}