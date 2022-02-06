package ru.netology

fun main() {
    val isRegularCustomer = true
    val previousPurchases = 0.0
    val nowPurchase = 500.0
    val price = checkDiscount(nowPurchase, previousPurchases)
    val discountRegular = if(!isRegularCustomer) 0.0 else price * 0.01
    val finalSum = price - discountRegular

    println("Сумма вашей покупки: $finalSum рублей")


}
fun checkDiscount(nowPurchase: Double, previousPurchases: Double): Double {
    return when (previousPurchases) {
        in 0.0..1000.0 -> nowPurchase
        in 1001.0..10000.0 -> nowPurchase - 100
        else -> nowPurchase * 0.05
    }
}

