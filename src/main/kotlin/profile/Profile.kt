package org.example.profile

import org.example.extensions.filter
import org.example.extensions.myForEach
import org.example.extensions.transform

fun main() {


    showEmail()
}

fun filterCollection() {
    ProfilesRepository.profiles
        .filter { it.age > 25 }
        .filter { it.gender == Gender.MALE }
        .filter {it.firstName.startsWith("A")  }
        .filter { it.age < 30 }
        .toSet()
        .map { it.copy(age = it.age + 1) }
        .sortedBy { it.firstName }
        .myForEach { println(it) }
}

fun showEmail() {
    println("Write id: ")
    val idPrint = readln().toInt()
    ProfilesRepository.profiles.find { it.id == idPrint }?.let { println(it.email) } ?: println("Not found")
}
