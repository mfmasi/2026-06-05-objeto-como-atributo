package org.example.resto

class Persona(private var nombre: String = "", private var apellido: String = "", private var fecha: Fecha=Fecha()) {//con esa cosa rara llamo a la función dentro de los parámetros para que "la resuelva" y el dato resultante sea parámetro de esta clase
    fun arranque(nombre: String, apellido: String) {
        this.nombre=nombre        
        this.apellido=apellido
    }

    override fun toString(): String {
        return "Nombre: $nombre $apellido.\nFecha: $fecha"
    }
}