package ru.netology

import kotlin.math.roundToInt

fun main() {
    val previousPurchases = 1001
    val nowPurchase = 500
    val price = checkDiscount(nowPurchase = nowPurchase, previousPurchases =previousPurchases)
    val sum = price - discountRegular(sum = price, isRegular = true)
    println(formattedMessage(sum))


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

fun discountRegular (sum: Int, isRegular: Boolean): Int{
    return if (!isRegular) 0 else (sum * 0.01).roundToInt()
}


