
package structural_pattern.decorator

fun main(){
    val customerMessage = CustomerMessage(
        "Ambrosio Cardoso Jimenez", "cardosojmz@gmail.com", "9513618396")

    println("Original Message ==> ${customerMessage} ")

    val message1 = EncryptMessage(
        "usuario", "HG58YZ3CR9123456",
        SOAPEnvelopMessage(
            XMLFormatterDecorate(customerMessage)
        )
    ).processMessage().content
    println(
        "message1 =====================================>\n"
                + message1 + "\n\n"
    )

    val message2 = SOAPEnvelopMessage(
        EncryptMessage(
            "usuario", "HG58YZ3CR9123456",
            XMLFormatterDecorate(customerMessage)
        )
    ).processMessage().content
    println(
        ("message2 =====================================>\n"
                + message2)
    )
}
