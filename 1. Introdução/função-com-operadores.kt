fun main() {
    operator fun Int.times(frase: String) = frase.repeat(this)       
    println(2 * "Bye ")                                          
  
    operator fun String.get(range: IntRange) = substring(range)  
    val frase = "Sempre esqueça seus inimigos; Nada os irrita tanto do que serem esquecidos!."
    println(frase[0..74])                                          

}
