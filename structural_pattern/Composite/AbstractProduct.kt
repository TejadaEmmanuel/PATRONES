package structural_pattern.Composite

abstract class AbstractProduct (
    //val name: String, private val price:Double, val impuesto: Double, val cantidad: Int){
    val name: String,
    val tax: Double,
    private val price:Double,
    val quantity: Long){
    //open fun  calcularImpuesto () = impuesto
    open fun getPrice() : Double{return  price * quantity}

}