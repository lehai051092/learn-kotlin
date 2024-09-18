class ContactAccessProperties (val id: Int, var email: String)

fun main() {
    val contact = ContactAccessProperties(1, "mary@gmail.com")
    println("Their email address is: ${contact.email}")

    contact.email = "jane@gmail.com"
    println("Their email address is: ${contact.email}")
}