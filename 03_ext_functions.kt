/* Extension functions in Kotlin */

// ammettiamo di voler definire una funzione per calcolare il cubo di un numero intero.
// Una maniera potrebbe essere la seguente:

fun cubo(n: Int): Int = n * n * n

// siccome la funzione opera su un intero, tuttavia, sarebbe opportuno che cubo() fosse
// definita come metodo della classe Int. Se non abbiamo a disposizione il codice della
// classe cui intendiamo aggiungere un metodo, possiamo definire una extension function:

fun Int.cuboExt() = this * this * this

fun main() {
    println(cubo(2))
    println(2.cuboExt())
}

// Esercizio: ridefinire mappa() e filtra() come extension function di List (o di MutableList)
