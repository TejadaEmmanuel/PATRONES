package structural_pattern.adapter

fun main(){
    val request =BankCreditRequest("Abilene Guadalupe ", 3000.00)

    val xBank: IBankAdapter= XBankCreditAdapter()
    val xresponse =xBank.sendCreditRequest(request)
    println(
        """
         ${"xBanck aproved >" + xresponse.approved}   
        """.trimIndent()
    )
    if (xresponse.approved){
        println("xBanck aprobó su crédito, felicidades!!")

    }
    else {
        println("lo sentimos el su crédito no ha sido aprobado")
    }

}