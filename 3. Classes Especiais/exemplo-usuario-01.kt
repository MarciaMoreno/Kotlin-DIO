data class Usuario(val nomeUsuario: String, val email: String)

fun getUser1() = Usuario("Maria do Carmo Assunção", "email-01@gmail.com")
fun getUser2() = Usuario("Suassuna da Costa Dias", "email-02@gmail.com")
fun getUser3() = Usuario("Moreira da Cruz", "email-03@gmail.com")
fun main(){
    val usuario1 = getUser1()
    val usuario2 = getUser2()
    val usuario3 = getUser3()
    
	val(nomeUsuario, email) = usuario1    
    val(_, emailAddress) = getUser1()
    println(usuario1)
    
    val(nomeUsuario2, email2) = usuario2    
    val(_2, emailAddress2) = getUser2()
    println(usuario2)
    
    val(nomeUsuario3, email3) = usuario3    
    val(_3, emailAddress3) = getUser1()
    println(usuario3)
}
