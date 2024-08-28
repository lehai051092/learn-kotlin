fun main() {
    /**
     * practice
     */
    // exercise 1
    // You have a list of “green” numbers and a list of “red” numbers. Complete the code to print how many numbers there are in total.
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    println("Total: ${greenNumbers.count() + redNumbers.count()}")

    // exercise 2
    // You have a set of protocols supported by your server. A user requests to use a particular protocol.
    // Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
    val protocolsSupported = setOf("HTTP", "HTTPS", "FTP")
    val protocol = "smtp"
    val isSupported = protocol.uppercase() in protocolsSupported
     println("Support for $protocol: $isSupported")

    // exercise 3
    // Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.
    val number2word: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}