class Customer

class Contact (val id: Int, var email: String)

fun main() {

    val Customer = Customer()

    val contact = Contact(1, "mary@gmail.com")

    print(contact.id)
    contact.email = "jane@gmail.com"
    println(contact.email)  
}