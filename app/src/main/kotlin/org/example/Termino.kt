Termino
package org.example

open class Termino(val escalar: Int, val grado: Int) {
    override fun toString(): String {
        return "${escalar}X^${grado}"
    }
}