 /*
  * Exemplo de uso da funação 'apply' 
  * nas funções de escopo... 
 */
data class DadosPessoais(var nome: String, var idade: Int, var sobre: String){
    constructor(): this(" ",0," ")
}

    fun main(){
    val jake = DadosPessoais()
    val descricao = jake.apply{
        nome = " Jake Sully del Passos"
        idade = 30
        sobre = " Desenvolvedor Android"
    }.toString()
    println(jake.toString())
}
