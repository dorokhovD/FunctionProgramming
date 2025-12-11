package org.example.dictionary

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import javax.management.Descriptor

@Serializable
data class Entry(
    @SerialName("value") val value: String,
    @SerialName("description") val description: String
)
