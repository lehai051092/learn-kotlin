import kotlin.random.Random

fun main() {
    // Exercise 1
    // Create a simple game where you win if throwing two dice results in the same number.
    // Use if to print You win :) if the dice match or You lose :( otherwise.

    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    if (firstResult == secondResult) println("You win :)") else println("You lose :(")

    // Exercise 2
    // Using a when expression, update the following program so that when you input the names of GameBoy buttons, the actions are printed as output.
    val button = "Y"
    val result = when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    println("Result: $result")
}