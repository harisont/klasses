/* Somme impossibili */

val n : Number = 10
val m : Number = 11.5

val n2 : Int = 10
val m2 : Double = 11.5

fun main() {
    // val sum = n + m	// non funziona perché + é implementato nelle sottoclassi
    val sum = n2 + m2	// funziona!
	print(sum)
}
