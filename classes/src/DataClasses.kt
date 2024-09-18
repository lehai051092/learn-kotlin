/**
 * To declare a data class, use the keyword data
 */
data class User(val name: String, val id: Int)

fun main() {
    /**
     * Data classes
     */

    //// Print as string
    val user = User("Alex", 1)
    // Automatically uses toString() function so that output is easy to read
    println(user)

    //// Compare instances
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Compares user to second user
    println("user == secondUser: ${user == secondUser}")

    // Compares user to third user
    println("user == thirdUser: ${user == thirdUser}")

    //// Copy instance
    // Creates an exact copy of user
    println(user.copy())

    // Creates a copy of user with name: "Max"
    println(user.copy("Max"))

    // Creates a copy of user with id: 3
    println(user.copy(id = 3))
}