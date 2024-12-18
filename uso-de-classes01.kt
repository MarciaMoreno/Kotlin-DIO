class Contatos( var id: Int, var email: String)

fun main(){
    var contatos = Contatos(0," ")
    
    contatos.id++
    contatos.email = "email-01@gmail.com"
    println("ID CALL: "+contatos.id+" - "+contatos.email)
    contatos.id++
    contatos.email = "email-02@gmail.com"
    println("ID CALL: "+contatos.id+" - "+contatos.email)
    contatos.id++
    contatos.email = "email-03@gmail.com"
    println("ID CALL: "+contatos.id+" - "+contatos.email)
    contatos.id++
    contatos.email = "email-04@gmail.com"
    println("ID CALL: "+contatos.id+" - "+contatos.email)
    contatos.id++
    contatos.email = "email-05@gmail.com"
    println("ID CALL: "+contatos.id+" - "+contatos.email)
    contatos.id++
    contatos.email = "email-06@gmail.com"
    println("ID CALL: "+contatos.id+" - "+contatos.email)
    
    
}
