fun main() {
    /**
     * Loops
     */

    //// for
    // Using your new knowledge of ranges, you can create a for loop that iterates over numbers 1 to 5 and prints the number each time.
    for (number in 1..5) {
        print("$number ")
    }

    // Collections can also be iterated over by loops
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("\nYummy, it's a $cake cake!")
    }


    //// while
    // To execute a code block while a conditional expression is true. (while)
    // To execute the code block first and then check the conditional expression. (do-while)

    // In the first use case (while)
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    // In the second use case (do-while)
    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}