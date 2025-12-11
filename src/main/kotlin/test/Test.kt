package org.example.test

import org.example.extensions.myAlso
import org.example.extensions.myApply


fun main() {

}

fun exampleWith() {
    with(mutableListOf<Int>()) {
        while (true) {
            print("Enter number or 0 to exit ")
            val number = readln().toInt().takeIf { it != 0 } ?: break
            add(number)
        }
        println("Max: ${max()}")
        println("Max: ${min()}")
        this
    }.forEach {
        println(it)
    }
}


fun exampleApply() {
    mutableListOf<Int>().apply {
        while (true) {
            print("Enter number or 0 to exit ")
            val number = readln().toInt().takeIf { it != 0 } ?: break
            this.add(number)
        }
    }.forEach {
        println(it)
    }
}

