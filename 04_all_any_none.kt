/* Altre funzioni utili per lavorare con le liste */

// Definiamo delle semplici lambda su numeri interi
val dispari = {n: Int -> n % 2 != 0}
val pari = {n: Int -> n % 2 == 0}
val positivo = {n: Int -> n > 0}
val negativo = {n: Int -> n > 0}

// Definiamo anche una serie di liste per fare qualche test
val l1 = listOf(1,2,3,4,5)
val l2 = listOf(2,4,6,8,10)
val l3 = listOf(-1,0,1)

fun main() {
    println(l1.all(positivo))
    println(l2.any(dispari))
    println(l3.none(negativo))
    println(l2.none(dispari))
}

// Esercizio: reimplementare all (tutti), any (almeno_uno) e none (nessuno) come extension functions di List
