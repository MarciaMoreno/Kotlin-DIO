/*
 * Exemplo 01 de uso da função com Loops Itarators... 
*/

class Animal(val name1: String, val name2: String, val name3: String)
class Zoo(val especie : List<Animal>){
	  operator fun iterator(): Iterator<Animal>{
		    return especie.iterator()
    }
}

fun main(){
    val zoo = Zoo(listOf(Animal("Zebra","Bufalo","Cavalo"), Animal("Leão","Tigre","Onça")))
    for (animal in zoo){
		    println("Jaula com ${animal.name1}, ${animal.name2}, e ${animal.name3}")
    }
}
