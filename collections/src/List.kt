fun main() {
    /**
     * List
     *
     * Lists store items in the order that they are added, and allow for duplicate items.
     * To create a read-only list (List), use the listOf() function.
     * To create a mutable list (MutableList), use the mutableListOf() function.
     */

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle");
    println(readOnlyShapes)

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(shapes)

    // You can create a read-only view of a mutable list by assigning it to a List
    // This is also called casting
    val shapesLocked: List<String> = shapes
    println(shapesLocked)

    // The first item in the list is: triangle
    println("The first item in the list is: ${readOnlyShapes[0]}")

    // To get the first or last item in a list, use .first() and .last() functions respectively
    println("The first item in the list (use .first()) is: ${readOnlyShapes.first()}")
    println("The last item in the list (use .last()) is: ${readOnlyShapes.last()}")

    // To get the number of items in a list, use the .count() function
    println("This list has ${readOnlyShapes.count()} items")

    // To check that an item is in a list, use the in operator
    println("Check that an item in a list: ${"circle" in readOnlyShapes}")

    // To add or remove items from a mutable list, use .add() and .remove() functions respectively
    // Add "pentagon" to the list
    shapes.add("pentagon")
    println(shapes)

    // Remove the first "pentagon" from the list
    shapes.remove("pentagon")
    println(shapes)

    // Điều này sẽ gây lỗi vì sets không hỗ trợ truy cập qua chỉ số
    // val fruitAtIndexZero = fruit[0] // Lỗi: Unresolved reference: get
}