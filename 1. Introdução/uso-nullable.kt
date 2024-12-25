fun descricao(umaString : String?): String{
	if(umaString != null && umaString.length >= 0){
        return "O tamanho da variável é ${umaString.length}"
    }else{
        return "Esta variável não recebeu qualquer valor"
    }
}

fun main(){
	println(descricao(null))
    println(descricao(" "))
    println(descricao("Tenha um ótimo dia"))
}
