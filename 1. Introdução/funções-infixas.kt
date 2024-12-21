fun main() {

  infix fun Int.times(contador: String) = contador.repeat(this)
  val contador = listOf("Maria de Jesus","Sara Farias","Carlos Antonio Maia")
  println(3  times "$contador")                                    

  val pares = "Ferrari" to "Katrina"                          
  println(pares)

  infix fun String.onto(other: String) = Pair(this, other)   
  val meusPares = "McLaren" onto "Lucas"
  println(meusPares)

  val sophia = Pessoa("Sophia")
  val claudia = Pessoa("Claudia")
  sophia likes claudia  
}

class Pessoa(val name: String) {
  val likedPeople = mutableListOf<Pessoa>()
  infix fun likes(other: Pessoa) { likedPeople.add(other) } 
}
