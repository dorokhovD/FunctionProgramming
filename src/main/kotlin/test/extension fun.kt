package org.example.test

fun main() {

}

fun List<Int>.sumOfEvens(): Int {
    var sum: Int = 0
    for (i in this) {
        if (i %2 == 0)
            sum += i
    }
    return sum
}

fun processList() {
    val str = readln().split(" ")
    val list = str.map { it.toInt() }
    println("Сумма чётных чисел: ${list.sumOfEvens()}")
}