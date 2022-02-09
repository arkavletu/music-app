package ru.netology

import kotlin.math.roundToInt

fun main() {
    val isRegularCustomer = false
    val previousPurchases = 1001
    val nowPurchase = 500
    val price = checkDiscount(nowPurchase, previousPurchases)
    val discountRegular = if (!isRegularCustomer) 0 else (price * 0.01).roundToInt()
    val sum = price - discountRegular
    val message = formattedMessage(sum)
    println(message)


}

fun checkDiscount(nowPurchase: Int, previousPurchases: Int): Int {
    return if (previousPurchases > 10000) (nowPurchase * 0.95).roundToInt()
    else if (previousPurchases > 1000) nowPurchase - 100
    else nowPurchase

}

fun formattedMessage(sum: Int): String {
    val roubles = sum / 100
    val cents = sum % 100
    return "Сумма вашей покупки: $roubles рублей $cents копеек"
}


