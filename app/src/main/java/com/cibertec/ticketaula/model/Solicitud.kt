package com.cibertec.ticketaula.model

data class Solicitud(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val categoria: String,
    val prioridad: String
)
