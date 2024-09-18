/**
 * Within parentheses () after the class name.
 */
class Contact(val id: Int, var email: String)


/**
 * Within the class body defined by curly braces {}.
 */
class ContactCurlyBraces(val id: Int, var email: String) {
    val category: String = ""
}

/**
 * Class properties can have default values.
 */
class ContactDefaultValues(val id: Int, var email: String = "example@gmail.com") {
    val category: String = "work"
}