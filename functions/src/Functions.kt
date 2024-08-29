/**
 * Named arguments
 */
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

/**
 * Default parameter values
 */
fun printMessageWithPrefixDefaultParameterValues(message: String, prefix: String = "Log") {
    println("[$prefix] $message")
}

/**
 * Functions without return
 */
fun printMessageWithoutReturn(message: String) {
    println(message)
    // `return Unit` or `return` is optional
}

/**
 * Single-expression functions
 * You can remove the curly braces {} and declare the function body using the assignment operator =
 * Example: fun sumSingleExpression(x: Int, y: Int) = x + y
 */
fun sumSingleExpression(x: Int, y: Int): Int {
    return x + y
}

/**
 * Early returns in functions
 */
// A list of registered usernames
val registeredUsernames = mutableListOf("john_doe", "jane_smith")

// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // Early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    // Proceed with the registration if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

fun main() {
    /**
     * Functions
     */

    //// Named arguments
    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    //// Default parameter values
    // Function called with both parameters
    printMessageWithPrefixDefaultParameterValues("Hello", "Log")

    // Function called only with message parameter
    printMessageWithPrefixDefaultParameterValues("Hello")

    // Uses named arguments with swapped parameter order
    printMessageWithPrefixDefaultParameterValues(prefix = "Log", message = "Hello")

    //// Functions without return
    printMessageWithoutReturn("Hello")

    //// Single-expression functions
    println(sumSingleExpression(1, 2))

    //// Early returns in functions
    println(registerUser("john_doe", "newjohn@example.com"))
    println(registerUser("new_user", "newuser@example.com"))
}