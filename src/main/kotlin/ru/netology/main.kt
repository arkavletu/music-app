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
    return if (previousPurchases in 1001.00..10000.00)
        nowPurchase - 100
    else if (previousPurchases > 10000)
        nowPurchase - nowPurchase * 0.05
    else nowPurchase
}
