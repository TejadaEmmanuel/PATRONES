package structural_pattern.Composite

import creational_pattern.prototype.Product
import java.text.DecimalFormat

class SaleOrder(private val orderId:Long, private val customer: String ) {
    private val products: MutableList<AbstractProduct> = ArrayList()
    private fun getPrice(): Double {
        return products.sumOf {it.getPrice()}
    }
    fun addProducts(product: AbstractProduct) {
        products.add(product)

        }
    fun printOrder(){
        val formater = DecimalFormat("###,##0.00")
        println ("ORDER_ID: ${orderId}, Customer: $customer")
        products.forEach {
            println(it.name + "\t\t\t" + formater.format(it.getPrice()))
        }
        println("Total: " + formater.format(getPrice()))
    }
}