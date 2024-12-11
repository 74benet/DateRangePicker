package com.example.aufgabe3.model

import java.time.LocalDate
import java.util.UUID

data class BookingEntry(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val arrivalDate: LocalDate,
    val departureDate: LocalDate
)
