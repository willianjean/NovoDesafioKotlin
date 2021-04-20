package com.everis.myapplication

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.min

import java.util.Scanner
import kotlin.math.pow

var temp = 2

fun main(args: Array<String>) {







    /* // conteudo da calculo do Maximo Divisor comum
    val lista = mutableListOf<Int>()
    var h = 0
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").run {map { it.toInt() }.toMutableList()}
        lista.add(mdc(input[0].toInt(),input[1].toInt()))


    }
    lista.forEach{println(it)}
    */

}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    val a = max(n1,n2)
    var b = min(n1,n2)
    if (a%b==0)
        return b
    else
        return mdc(b,(a%b))
}

fun calcularImpostoDeRenda(){
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F

    if ( r > 2000.0 && r <= 3000.0 ) {
        i = ((r-2000) * 8)/100
    } else if (r > 3000.0 && r <= 4500.0) {
        i = (((r-3000) * 18)/100)+80
    } else if (r > 4500) {
        i = (((r-4500) * 28)/100)+80+270
    }
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}

fun calcularAreaDoCirculo(){
    val input = Scanner(System.`in`)
    val raio = input.nextDouble()
    val pi = 3.14159
    val area = pi * raio.pow(2)
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
    println("A=$resultado")
}

fun calculoNumeroPrimoOtimizado(){
    val n = readLine () !!. toInt ()

    for (numeros in 1..n) {
        var ehPrimo = true

        val a = readLine () !!. toDouble()
        var raiz = Math.sqrt(a)

        for (b in 2..(raiz).toInt()){
            if ((a % b.toDouble()) == 0.0){
                ehPrimo = false
                break
            }
        }

        if (ehPrimo) println("Prime")
        else println("Not Prime")
    }

    fun corridaTartaruga(){
        var result = 0
        var total = 0
        while (true) {

            try {

                val l = readLine()!!.toInt()
                val v = readLine()!!.split(" ").run { map{it.toInt() }.toMutableList() }
                v.sort()
                result = when (v.last()) {
                    in 0..9 -> 1
                    in 10..19 -> 2
                    else -> 3
                }


                println(result)




            } catch (f : Exception) {
                break
            } catch (n : Exception) {
                break
            } catch (e : Exception) {
                break
            }
        }
    }
}