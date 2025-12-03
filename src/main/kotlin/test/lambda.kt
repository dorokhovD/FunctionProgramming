package org.example.test

fun main() {
    startProcessing()
}

fun processNumbers(
    list: List<Int>,
    filter: (Int) -> Boolean,
    refact: (Int) -> Int)
: List<Int> {

    val result = mutableListOf<Int>()
    for(number in list) {
        if (filter(number)) {
            result.add(refact(number))
        }
    }
    return result
}

fun startProcessing() {
    println("Введите числа, разделенные пробелами:")
    val strings = readln().split(" ")
    val numbers = strings.map { it.toInt() }
    val result = processNumbers(
        numbers,
        { it > 10 },
        { it * 3 }
    )
    println("Результат обработки: $result")
}