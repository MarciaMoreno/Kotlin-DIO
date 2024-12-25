/*
 * Exemplo 02 de uso da função com Loops Iterators... 
*/

class Aves(val name: String)
class Quadrupedes( val name: String)

class Zoo(val animais: List<Aves>){
	  operator fun iterator(): Iterator<Aves>{
        return animais.iterator()
    }
}
class Zoo1(val animais: List<Quadrupedes>){
	  operator fun iterator(): Iterator<Quadrupedes>{
        return animais.iterator()
    }
}


fun main(){
    val zoo = Zoo(listOf(Aves("Andorinhas"),Aves("Águias"),Aves("Araras-Azuis")))
    for(animal in zoo){
        println("PARTIÇÃO DAS AVES")
		    println("Esta é uma jaula, com ${animal.name}")
        println("-----------------------------------------------------------------------")
    }
    val zoo1 = Zoo1(listOf(Quadrupedes("Zebra"),Quadrupedes("Búfalo"),Quadrupedes("Touro-Branco")))
    for(animal in zoo1){
        println("PARTIÇÃO DOS QUADRUPEDES")
		    println("Esta é uma jaula, com ${animal.name}")
        println("-----------------------------------------------------------------------")
    }
}
