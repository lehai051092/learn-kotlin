class ContactCreateInstance(val id: Int, var email: String)

fun main() {
    /**
     * Contact is a class.
     * contact is an instance of the Contact class.
     * id and email are properties.
     * id and email are used with the default constructor to create contact.
     */
    val contact = ContactCreateInstance(1, "mary@gmail.com")
}