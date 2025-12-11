package org.example.test

fun main() {
val strings = listOf<String>("Mazda", "Nissan", "Audi", "", "BMW", "Toyota", "", "Mercedes", "Haval", "Amoda")
    processStrings(strings)
}

/**
 * Обрабатывает коллекцию строк с использованием цепочки преобразований.
 * @param strings Коллекция строк для обработки.
 * @return Преобразованная коллекция строк.
 */
fun processStrings(strings: List<String>): List<String> {
    return strings.also {
        println("Исходный список: $strings")
    }.filter { it.isNotBlank() }.also { // Убираем пустые строки
        println("Этап 1: Осталось ${it.size} непустых строк")
    }.map { it.trim() // Убираем лишние пробелы
    }.filter { it.length > 3 }.also {   // Оставляем строки длиной больше 3
            println("Этап 2: Строки длиной более 3 символов: $it")
    }.sortedBy { it.length }.also { // Сортируем по длине
        println("Этап 3: Первые 3 строки после сортировки: ${it.take(3)}")
    }.map { it.uppercase() }.also { // Преобразуем в верхний регистр
        println("Этап 4: Все строки в верхнем регистре: $it")
    }.distinct()         // Убираем дубликаты
    .take(5).also { // Берём первые 5 строк
        println("Этап 5: Итоговый результат: $it")
    }
}