open class Persona(val nome: String, val cognome: String, var eta: Int) {
     open fun presentati() {
         println("Mi chiamo $nome $cognome e ho $eta anni.")
     }
     
     fun aumeta(){
     this.eta ++
	}
} 

class Studente(nome: String, cognome: String, eta: Int, var materia: String): Persona(nome, cognome, eta) {
    override fun presentati() {
        super.presentati()
        println("Studio $materia")
    }
    
}

class Genitore(nome: String, cognome: String, eta: Int, var figli: MutableList<Persona>): Persona(nome, cognome, eta) {

}


fun main() {
    var p1 = Persona("Mario", "Bianchi", 50)
    p1.presentati()
    p1.aumeta()
    p1.presentati()
    
    var s1 = Studente("Mario", "Rossi", 50, "Matematica")
    s1.presentati()
    
    var p2 = Persona("Lucia", "Rossi", 14)
    
    var g1 = Genitore("Paolo", "Rossi", 84, mutableListOf(s1, p2))
    g1.presentati()
    
    val figliDiPaolo = g1.figli
    
    for (figlio in figliDiPaolo) {
        if (figlio.eta >= 18) 
        	println(figlio.nome)
    } 
    
    for (figlio in figliDiPaolo) {
        if (figlio is Studente) 
        	println(figlio.nome)
    } 
    
    //val stampaN = { p: Persona -> println(p.nome)}
    
    figliDiPaolo.map({ p: Persona -> println(p.nome)})
    
    fun stampaNome(p: Persona) {
        println(p.nome)
    }
    

}
