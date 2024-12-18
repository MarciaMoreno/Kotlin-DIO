fun descricao( umaString: String?):String{
    if(umaString != null && umaString.length >=0 ){
        return "O tamanho da variável é ${umaString.length}"
    }else{
	return "Esta variável não recebeu qualquer valor. O tamanho é nulo"
    }
}

fun main(){
    println(descricao(null))
    println(descricao("  "))
    println(descricao("dio.me"))
}
