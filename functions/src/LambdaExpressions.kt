/**
 * Return from a function
 */
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    /**
     * Lambda expressions
     * Example:
     * val upperCaseString = { text: String -> text.uppercase() }
     * println(upperCaseString("hello"))
     */

    //// Pass to another function
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter ({ x -> x > 0 })
    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    println(negatives)


    // Is using the .map() function to transform items in a collection
    val doubled = numbers.map { x -> x * 2 }
    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled)
    println(tripled)

    //// Function types
    val upperCaseString: (String) -> String = { text -> text.uppercase() }
    println(upperCaseString("hello"))

    //// Return from a function
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")

    //// Invoke separately
    println({ text: String -> text.uppercase() }("hello"))

    //// Trailing lambdas
    // The initial value is zero.
    // The operation sums the initial value with every item in the list cumulatively.
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

    // Alternatively, in the form of a trailing lambda
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
}