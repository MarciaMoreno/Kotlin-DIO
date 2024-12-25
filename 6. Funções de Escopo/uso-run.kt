 /*
  * Exemplo de uso da funação 'run' 
  * nas funções de escopo... 
 */

fun main(){
    fun verificador(ns: String?): Int{
		println("Para a variável \"$ns\" :")
        return ns?.run{        
            	if(isEmpty() != null){
                    println("\tEstá vazio? NÃO ")
                }else{
					          println("\tEstá vazio? SIM - O valor da variável é 'nula'")
                } 
            println("\tCumprimento da variável = $length")
            length
        }?: 0
    }
    
	verificador(null)
    println("-----------------------------------------------------------------------------------")
    verificador(" ")
    println("-----------------------------------------------------------------------------------")
    verificador("Tenha um bom dia!...")
    
}
 	
