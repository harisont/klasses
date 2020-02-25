val numeri = listOf(1,2,3,4,5)

fun main() {
    println(numeri)
    
    // Riepilogo: uso di map
    val numeriDecr = numeri.map({n -> n - 1})
    println(numeriDecr)
    
    // Uso di filter
    val numeriPari = numeri.filter({n -> n % 2 == 0})
    println(numeriPari)
    
    val numeriIncr = mappa({n -> n + 1}, numeri)
    println(numeriIncr)
    
    val numeriDispari = filtra({n -> n % 2 != 0}, numeri)
    println(numeriDispari)
    
}

// Implementazioni iterative di map e filter
fun <T> filtra(funzione: (T) -> Boolean, lista: List<T>): List<T> {
    var nuovaLista: MutableList<T> = mutableListOf<T>()
    for (elemento in lista) 
     if (funzione(elemento))
      nuovaLista.add(elemento)
    return nuovaLista
}

fun <T> mappa(funzione: (T) -> (T), lista: List<T>): List<T> {
    var nuovaLista: MutableList<T> = mutableListOf<T>()
    for (elemento in lista) 
     nuovaLista.add(funzione(elemento))
    return nuovaLista
}
