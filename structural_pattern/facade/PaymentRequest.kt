package structural_pattern.facade

import java.util.*

data class PaymentRequest(
    val customerId : Long,
    val amount : Double,
    val cardNumber : String,
    val cardName : String,
    val cardExpireDate : String,
    val cardSecureNumber : String

)
