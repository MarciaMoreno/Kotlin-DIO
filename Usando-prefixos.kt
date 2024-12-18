fun umaMensagem(mensagem: String) {
    	print(mensagem)
}

fun umaMensagemComPrefixo(mensagem: String, prefixo: String = "Info"){
	print("$prefixo: dois hamburgueres de frango, $mensagem")
}

fun main(){
	umaMensagem("Olá! ")
    	umaMensagemComPrefixo(prefixo = "Eu quero fazer um pedido", mensagem="Por gentileza!...")
}
