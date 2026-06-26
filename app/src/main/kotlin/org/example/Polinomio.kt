package org.example
import org.example.Termino

open class Polinomio(private var terminos: ArrayList<Termino> = arrayListOf<Termino>()) {

    fun sumar(otro: Polinomio): Polinomio {
        val todosLosTerminos = this.terminos + otro.terminos

        val resultadoList = todosLosTerminos.groupBy { it.exponente }
            .map { (exponente, lista) ->
                Termino(lista.sumOf { it.coeficiente }, exponente)
            }

        val resultadoArrayList = ArrayList(resultadoList)

        return Polinomio(resultadoArrayList)
    }

    override fun toString(): String {
        return terminos.joinToString("+")
    }
}