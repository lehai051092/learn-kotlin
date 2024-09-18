class ContractMemberFunctions (val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = ContractMemberFunctions(1, "mary@gmail.com")
    contact.printId()
}