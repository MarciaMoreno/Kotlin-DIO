/*
 * Trabalhando com Valores de parâmetro padrão 
 * e nomeando argumentos com uso de prefixos
 */

fun umaMensagem(mensagem: String){
    print(mensagem)
}

fun mensagemComPrefixo(mensagem: String, prefixo: String="Info"){
	  print("$prefixo, dois hamburgueres, $mensagem")
}

fun main() {
    umaMensagem("Olá!")
    mensagemComPrefixo(prefixo=" Eu quero fazer um pedido", mensagem="Por favor!...")
}
