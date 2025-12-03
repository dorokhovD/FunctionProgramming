package org.example.profile

class ConditionStartsWihA: Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.firstName.startsWith("A")
    }
}