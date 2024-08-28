fun main() {
    //// Exercise 1
    // Use a while loop.
    var pizzaSlicesWhile = 0
    while (pizzaSlicesWhile < 7) {
        pizzaSlicesWhile++
        println("There's only $pizzaSlicesWhile slice/s of pizza :(")
    }
    pizzaSlicesWhile++
    println("There are $pizzaSlicesWhile slices of pizza. Hooray! We have a whole pizza! :D")

    // Use a do-while loop.
    var pizzaSlicesDoWhile = 0
    pizzaSlicesDoWhile++
    do {
        println("There's only $pizzaSlicesDoWhile slice/s of pizza :(")
        pizzaSlicesDoWhile++
    } while (pizzaSlicesDoWhile < 8)
    println("There are $pizzaSlicesDoWhile slices of pizza. Hooray! We have a whole pizza! :D")

    //// Exercise 2
    // Write a program that simulates the Fizz buzz game.
    // Your task is to print numbers from 1 to 100 incrementally, replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
    // Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".
    for (number in 1..100) {
        println(
            when {
                number % 3 == 0 && number % 5 ==0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> number
            }
        )
    }

    //// Exercise 3
    // You have a list of words. Use for and if to print only the words that start with the letter l.
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}