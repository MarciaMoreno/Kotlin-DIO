enum class Nivel(var nivel: String){ 
    BASICO("Nivel de Aprendizado 01"), 
    INTERMEDIARIO("Nivel de Aprendizado 02"), 
    DIFICIL("Nivel de Aprendizado 03");
}

class Usuario(var matricula: Int, var email: String, var name_usuario: String)

data class ConteudoEducacional(var curso: String, val duracao: Int = 60){
	constructor(): this(" ",60)
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos_html = mutableListOf<Usuario>()   
    val inscritos_css= mutableListOf<Usuario>()    
    val inscritos_javascript = mutableListOf<Usuario>()
    
}

fun main() {
    
  	// trabalhando a classe Usuario e estruturando o objeto usuario
    val usuario = Usuario(5230, " ", " ")
    val usuario2 = Usuario(usuario.matricula++, " "," ")
    val usuario3 = Usuario(usuario.matricula++, " "," ")
    val usuario4 = Usuario(usuario.matricula++, " "," ")

    println("Lista de Usuários Matriculados DIO: ")
    usuario.email = "email-01-@gmail.com"; usuario.name_usuario = "Maria da Luz"
    println("Matricula: "+usuario.matricula+"/ E-mail: "+usuario.email+" - "+usuario.name_usuario)
    
    usuario2.email = "email-02-@gmail.com"; usuario2.name_usuario = "Carlos Sampaio"
    println("Matricula: "+usuario2.matricula+"/ E-mail: "+usuario2.email+" - "+usuario2.name_usuario)
    
    usuario3.email = "email-03-@gmail.com"; usuario3.name_usuario = "Vidal da Cruz"
    println("Matricula: "+usuario3.matricula+"/ E-mail: "+usuario3.email+" - "+usuario3.name_usuario)
    
    usuario4.email = "email-04-@gmail.com"; usuario4.name_usuario = "Sonia Souza"
    println("Matricula: "+usuario4.matricula+"/ E-mail: "+usuario4.email+" - "+usuario4.name_usuario)
    
    println("---------------------------------------------------------------------------------------------")
    println("Formações Disponíveis")
    val conteudo = ConteudoEducacional()
    val descricao1 = conteudo.apply{
		curso = " HTML "
        duracao 
    }.toString()
    print(descricao1)
    println(" - "+Nivel.BASICO)
    
     val descricao2 = conteudo.apply{
		curso = " CSS "
        duracao 
    }.toString()
    print(descricao2)
    println(" - "+Nivel.INTERMEDIARIO)
    
     val descricao3 = conteudo.apply{
		curso = " JavaScript "
        duracao 
    }.toString()
    print(descricao3)
    println(" - "+Nivel.DIFICIL)
    println("---------------------------------------------------------------------------------------------")
    
  	println("Inscritos nas Formações Disponiveis")
    
    // apara declarar o NOME DE USUARIO dos inscritos na Formação HTML...
    val inscritos_html = listOf(usuario.name_usuario,usuario2.name_usuario,usuario3.name_usuario,usuario4.name_usuario,)
   	for (inscritos_html_n in inscritos_html){
		print("Alunos INSCRITOS $descricao1: ")
        println("Email: $inscritos_html_n")
    }
    println("---------------------------------------------------------------------------------------------")
	
    // para declarar a matricula dos inscritos na Formação CSS...
    val inscritos_css = listOf(usuario.matricula,usuario2.matricula,usuario3.matricula,usuario4.matricula,)
	for (inscritos_css_m in inscritos_css){
		print("Alunos INSCRITOS $descricao2:")
        println("Matricula: $inscritos_css_m")
    }
     println("---------------------------------------------------------------------------------------------")
    // para declarar a EMAIL dos inscritos na Formação JavaScript...
    val inscritos_javascript = listOf(usuario.email,usuario2.email,usuario3.email,usuario4.email,)
	for (inscritos_javascript_e in inscritos_javascript){
		print("Alunos INSCRITOS $descricao3: ")
        println("e-mail: $inscritos_javascript_e")
    }
}
