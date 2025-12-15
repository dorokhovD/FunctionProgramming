package org.example.test

//  Пример 1. Ссылки на обычные функции
//  Вы можете передать ссылку на функцию в функцию высшего порядка, такую как map или filter.
fun double(x: Int): Int = x * 2

fun test1() {
    val numbers = listOf(1, 2, 3, 4)
    numbers.map(::double).also(::println)
//    val doubled = numbers.map { double(it) } // Нужно передать ссылку на функцию double
//    println(doubled)

}

//  Пример 2. Ссылки на методы экземпляра
//  Вы можете использовать ссылку на метод конкретного объекта.
//  Для этого используйте синтаксис objectName::methodName
class Printer {
    fun printMessage(message: String) {
        println(message)
    }
}

fun test2() {
    val printer = Printer()
    val messages = listOf("Hello", "World")
    messages.forEach(printer::printMessage)
    //messages.forEach { printer.printMessage(it) } // Нужно передать ссылку на метод экземпляра
}

//  Пример 3. Ссылки на методы класса
//  Для этого используйте синтаксис ClassName::methodName
object Utils {
    fun capitalize(word: String): String = word.uppercase()
}

fun test3() {
    val words = listOf("kotlin", "java", "scala")
    words.map(Utils::capitalize).also(::println)
//    val capitalized = words.map { Utils.capitalize(it) } // Нужно передать ссылку на метод capitalize()
//    println(capitalized)

}

//  Пример 4. Ссылки на extension-функции без параметров
//  Для этого используйте синтаксис Type::functionName.
fun String.isLongerThanThree(): Boolean = this.length > 3

fun test4() {
    val words = listOf("cat", "kotlin", "java")
    words.filter(String::isLongerThanThree).run(::println)
//    val longWords = words.filter { it.isLongerThanThree() } // Нужно передать ссылку на extension-функцию
//    println(longWords)
}

//  Пример 5. Ссылки на конструкторы
//  Вы можете использовать ссылки на конструкторы с одним параметром для создания объектов в функциональном стиле.
//  Для этого используйте синтаксис ::ClassName.
data class Person(val name: String)

fun test5() {
    val names = listOf("Alice", "Bob", "Charlie")
    names.map(::Person).run(::println)
//    val people = names.map { Person(it) } // Нужно передать ссылку на конструктор Person
//    println(people)
}


//  Пример 6. Пример с композицией функций
fun multiplyByTwo(x: Int): Int = x * 2
fun addTen(x: Int): Int = x + 10

fun test6() {
    val numbers = listOf(1, 2, 3)
    numbers.map(::multiplyByTwo).map(::addTen).run(::println)
//    val transformed = numbers.map { multiplyByTwo(it) }.map { addTen(it) } // Нужно передать ссылки на функции
//    println(transformed)
}


fun main() {
    test1()
    test2()
    test3()
    test4()
    test5()
    test6()
}