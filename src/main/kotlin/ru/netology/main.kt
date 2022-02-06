package ru.netology

fun main() {
    val isRegularCustomer = false
    val previousPurchases = 0
    val nowPurchase = 2000530

    val discount = when (previousPurchases) {
        in 0..1000 -> 0
        in 1001..10000 -> 100
        else -> {
            nowPurchase * 0.05
        }
    }.toInt()

    val discountForRegularCustomer = if (isRegularCustomer) (nowPurchase - discount) * 0.01 else 0

    val sum = (nowPurchase - discount) - discountForRegularCustomer.toInt()

    val roubles = sum / 100
    val cents = sum % 100

    println("Сумма вашей покупки: $roubles рублей $cents копеек")


}
