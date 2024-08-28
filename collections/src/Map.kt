fun main() {
    /**
     * Map
     *
     * Maps store items as key-value pairs. You access the value by referencing the key. You can imagine a map like a food menu.
     * You can find the price (value), by finding the food (key) you want to eat. Maps are useful if you want to look up a value without using a numbered index, like in a list.
     * Every key in a map must be unique so that Kotlin can understand which value you want to get. You can have duplicate values in a map.
     * To create a read-only map (Map), use the mapOf() function.
     * To create a mutable map (MutableMap), use the mutableMapOf() function.
     * When creating maps, Kotlin can infer the type of items stored. To declare the type explicitly, add the types of the keys and values within angled brackets <> after the map declaration.
     * For example: MutableMap<String, Int>. The keys have type String and the values have type Int.
     */

    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)

    // To prevent unwanted modifications, you can create a read-only view of a mutable map by assigning it to a Map
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    println(juiceMenuLocked)

    // To access a value in a map, use the indexed access operator [] with its key
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    // If you try to access a key-value pair with a key that doesn't exist in a map, you see a null value
    println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")

    // You can also use the indexed access operator [] to add items to a mutable map
    // Add key "coconut" with value 150 to the map
    juiceMenu["coconut"] = 150
    println(juiceMenu)

    // Remove key "orange" from the map
    juiceMenu.remove("orange")
    println(juiceMenu)

    // To get the number of items in a map, use the .count() function
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    // To check if a specific key is already included in a map, use the .containsKey() function
    println("check if a specific key is already included in a map: " + readOnlyJuiceMenu.containsKey("kiwi"))

    // To obtain a collection of the keys or values of a map, use the keys and values properties respectively
    println("keys: " + readOnlyJuiceMenu.keys)
    println("values: " + readOnlyJuiceMenu.values)

    // To check that a key or value is in a map, use the in operator
    println("orange" in readOnlyJuiceMenu.keys) // true
    // Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu) // true
    println(200 in readOnlyJuiceMenu.values) // false
}