package ru.netology

import kotlin.math.roundToInt

fun main() {
    val isRegularCustomer = false
    val previousPurchases = 1_000.5
    val nowPurchase = 500.0
    val price = checkDiscount(nowPurchase, previousPurchases).roundToInt()
    val discountRegular = if (!isRegularCustomer) 0 else (price * 0.01).roundToInt()
    val sum = price - discountRegular
    val message = formattedMessage(sum)
    println(message)


}

fun checkDiscount(nowPurchase: Double, previousPurchases: Double): Double {
    return if (previousPurchases > 10000) nowPurchase * 0.95
    else if (previousPurchases > 1000) nowPurchase - 100
    else nowPurchase

}

fun formattedMessage(sum: Int): String {
    return "Сумма вашей покупки: $sum рублей"
}


