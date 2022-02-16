package ru.netology

import kotlin.math.roundToInt

fun main() {
    val isRegularCustomer = true
    val previousPurchases = 1001
    val nowPurchase = 50050
    val price = checkDiscount(nowPurchase = nowPurchase, previousPurchases =previousPurchases)
    val sum = if(!isRegularCustomer) price else priceForRegular(price)
    println(formattedMessage(sum))


}

fun checkDiscount(nowPurchase: Int, previousPurchases: Int): Int {
    return if (previousPurchases > 10000) (nowPurchase * 0.95).roundToInt()
    else if (previousPurchases > 1000) nowPurchase - 100 * 100
    else nowPurchase

}

fun priceForRegular (sum: Int): Int{
    return (sum - sum * 0.01).roundToInt()
}

fun formattedMessage(sum: Int): String {
    val roubles = sum / 100
    val cents = sum % 100
    return "Сумма вашей покупки: $roubles рублей $cents копеек"
}


