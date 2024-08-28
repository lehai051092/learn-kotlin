fun main() {
    println("Hello World!")

    /**
     * variables
     */
    // Read-only variables with val
    val popcorn = 5
    val hotdog = 7

    // Mutable variables with var
    var customers = 10

    customers = 8
    println(customers)

    /**
     * string templates
     */
    println("There are $customers customers")
    println("There are ${customers + 1} customers")

    /**
     * practice
     */
    val name = "Mary"
    val age = 20

    println("$name is $age years old")
}