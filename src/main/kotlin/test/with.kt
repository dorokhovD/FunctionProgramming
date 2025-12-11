package org.example.test

fun main() {

}

fun formatText(title: String, body: List<String>, footer: String): String {
    require(title.isNotBlank()) { "Title must not be blank" }
    require(body.isNotEmpty()) { "Body must contain at least one paragraph" }
    require(footer.isNotBlank()) { "Footer must not be blank" }

    val debugKeyword = "debug"
    val oldHeader = "=== Начало текста ==="
    val newHeader = "=== Новый заголовок ==="
    val maxTextLength = 500

     with(StringBuilder()) {
        append("=== $title ===\n")
        body.forEach { paragraph -> append("$paragraph\n") }
        append("--- $footer ---\n")
        insert(0, "\n$oldHeader\n")
        append("\n=== Конец текста ===")

        indexOf(debugKeyword).takeIf { it != -1 }?.let { delete(it, it + debugKeyword.length) }

         indexOf(oldHeader).takeIf { it != -1 }
             ?.let { replace(it, it + oldHeader.length, newHeader) }

             .takeIf { length > maxTextLength }
             ?.setLength(maxTextLength)
        return toString()
    }
}

    //val builder = StringBuilder()
    //builder.append("=== $title ===\n")
    //body.forEach { paragraph -> builder.append("$paragraph\n") }
    //builder.append("--- $footer ---\n")

    //builder.insert(0, "\n$oldHeader\n")
    //builder.append("\n=== Конец текста ===")

    //val debugIndex = builder.indexOf(debugKeyword)
    //if (debugIndex != -1) {
    //    builder.delete(debugIndex, debugIndex + debugKeyword.length)
    //}

    //val oldHeaderIndex = builder.indexOf(oldHeader)
    // if (oldHeaderIndex != -1) {
    //    builder.replace(oldHeaderIndex, oldHeaderIndex + oldHeader.length, newHeader)
    //}

    //if (builder.length > maxTextLength) {
    //    builder.setLength(maxTextLength)
    //}

    //return builder.toString()
