package structural_pattern.bridge

fun main (){
    val aesImpl: IMessageEncrypt = MessageEncryptImpl(
    AESEncryptAlgorithm())
    val desImpl: IMessageEncrypt = MessageEncryptImpl(
    DESEncryptAlgorithm())
    val noImpl: IMessageEncrypt = MessageEncryptImpl(
    NoEncryptAlgorithm())
try {
    val message = "{\":\"Ambrosio Cardoso Jimenez\",\"age\":48}"
    val messsageAES = aesImpl.encryptMessage(message, "AG58YZ3CR9123458")
    println("messageAES > $messsageAES\n")
    val messageDES = noImpl.encryptMessage(message, "XMzDdG4D03CKm2Ix")
    println("messageDES > $messageDES\n")
    val messageNo = noImpl.encryptMessage(message, "")
    println("messageNo > $messageNo\n")
}catch (e: Exception) {
    e.printStackTrace()

}
}