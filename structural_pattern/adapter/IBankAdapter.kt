package structural_pattern.adapter


interface IBankAdapter {
    fun sendCreditRequest(
        bankCreditRequest: BankCreditRequest
    ): BankCreditResponse
}