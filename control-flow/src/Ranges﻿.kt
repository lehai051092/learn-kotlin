fun main() {
    /**
     * Ranges
     */

    // The most common way to create a range in Kotlin is to use the .. operator. For example, 1..4 is equivalent to 1, 2, 3, 4.
    val range1: IntRange = 1..4
    for (i in range1) {
        print("range1-$i ")
    }
    println()

    // To declare a range that doesn't include the end value, use the ..< operator. For example, 1..<4 is equivalent to 1, 2, 3.
    val range2: IntRange = 1..<4
    for (i in range2) {
        print("range2-$i ")
    }
    println()

    // To declare a range in reverse order, use downTo. For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.
    val range3: IntProgression = 4 downTo 1
    for (i in range3) {
        print("range3-$i ")
    }
    println()

    // To declare a range that increments in a step that isn't 1, use step and your desired increment value. For example, 1..5 step 2 is equivalent to 1, 3, 5.
    val range4: IntProgression = 1..5 step 2
    for (i in range4) {
        print("range4-$i ")
    }
    println()

    // 'a'..'d' is equivalent to 'a', 'b', 'c', 'd'
    val charRange1: CharRange = 'a'..'d'
    for (i in charRange1) {
        print("charRange1-$i ")
    }
    println()

    // 'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'
    val charRange2: CharProgression = 'z' downTo 's' step 2
    for (i in charRange2) {
        print("charRange2-$i ")
    }
    println()
}