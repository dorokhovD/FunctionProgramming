package org.example.test
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
// Класс User, который необходимо сериализовать и десериализовать
data class User(
    val id: Int,
    val name: String,
    val email: String,
    val registeredAt: String
)

// Реализуйте эту функцию для сериализации объекта User
fun serializeUser(user: User): String {
    // Реализуйте сериализацию
    //return "[{\"id\":\"${user.id}\",\"name\":\"${user.name}\",\"email\":\"${user.email}\",\"registeredAt\":\"${user.registeredAt}\",\"}]"
    val UserAsString = Json.encodeToString(user)
    return UserAsString
}
// Реализуйте эту функцию для десериализации строки JSON в объект User
fun deserializeUser(json: String): User {

    val jsons = Json.decodeFromString<User>(json.trim())
    return jsons
}