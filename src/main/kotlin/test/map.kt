package org.example.test

fun main() {
    val scores = mapOf(
        "Alice" to 95,
        "Bob" to 87,
        "Charlie" to 78
    )
    // Преобразуем оценки в текстовые категории
    val categorizedScores = scores.transformValues { score ->
        when {
            score >= 90 -> "Отлично"
            score >= 80 -> "Хорошо"
            score >= 70 -> "Удовлетворительно"
            else -> "Неудовлетворительно"
        }
    }
    // Ожидаемый результат: {Alice=Отлично, Bob=Хорошо, Charlie=Удовлетворительно}
    println(categorizedScores)
}
/**
 * Расширение для преобразования значений в `Map`.
 * @param transform Функция для преобразования значений.
 * @return Новый `Map` с теми же ключами, но преобразованными значениями.
 */
fun <K, V, R> Map<K, V>.transformValues(transform: (V) -> R): Map<K, R> {
    val map = mutableMapOf<K, R>()
    for (entry in this) {
        map[entry.key] = transform(entry.value)
    }
    return map
}