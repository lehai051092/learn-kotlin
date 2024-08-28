fun main() {
    /**
     * Set
     *
     * Whereas lists are ordered and allow duplicate items, sets are unordered and only store unique items.
     * To create a read-only set (Set), use the setOf() function.
     * To create a mutable set (MutableSet), use the mutableSetOf() function.
     */

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    // You can see in the previous example that because sets only contain unique elements, the duplicate "cherry" item is dropped.
    println(readOnlyFruit)

    // To prevent unwanted modifications, you can create a read-only view of a mutable set by assigning it to a Set
    val fruitLocked: Set<String> = fruit
    println(fruitLocked)

    // To get the number of items in a set, use the .count() function
    println("This set has ${readOnlyFruit.count()} items")

    // To check that an item is in a set, use the in operator:
    println("Check that an item in a list: " + "banana" in readOnlyFruit)

    // To add or remove items from a mutable set, use .add() and .remove() functions respectively
    // Add "dragonfruit" to the set
    fruit.add("dragonfruit")
    println(fruit)

    // Remove "dragonfruit" from the set
    println(fruit)

}