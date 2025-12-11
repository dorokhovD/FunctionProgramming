package org.example.test

// TODO: Определить универсальную функцию transform
// 1. Использовать дженерики `<T, R>` для параметризации типов.
// 2. Принимать коллекцию элементов типа `T`.
// 3. Принимать лямбда-выражение, преобразующее элемент типа `T` в элемент типа `R`.
// 4. Преобразовать каждый элемент коллекции с помощью переданного лямбда-выражения.
// 5. Вернуть новую коллекцию с элементами типа `R`.

fun main() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    val res = transform(list) { it.toString() }

    for (r in res) {
        println(r + "! ")
    }
}

fun <T, R> transform(collection: Collection<T>, operation: (T) -> R): List<R> {
    val result = mutableListOf<R>()

    for (collect in collection) {
        result.add(operation(collect))
    }
    return result
}