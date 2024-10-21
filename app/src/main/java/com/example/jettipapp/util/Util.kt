package com.example.jettipapp.util


fun calculateTotalTip(totalBill: Double,
                      tipPercentage: Int,
                      splitBy: Int): Double {

    return if (totalBill > 1 &&
        totalBill.toString().isNotEmpty())
        (totalBill * tipPercentage) / 100 else 0.0
}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercentage: Int) : Double{

    val bill = calculateTotalTip(
        totalBill = totalBill,
        tipPercentage = tipPercentage,
        splitBy = splitBy
    ) + totalBill

    return (bill / splitBy)
}