fun main() {
    /**
     * Conditional expressions
     *
     * Kotlin provides if and when for checking conditional expressions.
     * If you have to choose between if and when, we recommend using when
     */

    //// if
    // To use if, add the conditional expression within parentheses () and the action to take if the result is true within curly braces {}
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // There is no ternary operator condition ? then : else in Kotlin. Instead, if can be used as an expression.
    // If there is only one line of code per action, the curly braces {} are optional
    val a = 1
    val b = 2
    println(if (a > b) a else b)

    //// When
    // Use `when` when you have a conditional expression with multiple branches.
    val obj = "Hello"

    when (obj) {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }

    // This example uses a when expression without a subject to check a chain of Boolean expressions
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
}