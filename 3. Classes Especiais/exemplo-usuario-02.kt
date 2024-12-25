 data class User(val nome: String, val id: Int ){
     override fun equals(other: Any?) = other is User && other.id == this.id
 }
 
 fun main(){
    val primeiroUsuario = User("Alexandro da Silva", 11)
    val segundoUsuario = User("Mariano do Carmo Simplicio", 12)
    val terceiroUsuario = User("Alexandro da Silva", 11)
    
    println("primeiroUsuario == primeiroUsuario: ${primeiroUsuario == primeiroUsuario}")  
    println("primeiroUsuario == segundoUsuario: ${primeiroUsuario == segundoUsuario}")
    println("primeiroUsuario == terceiroUsuario: ${primeiroUsuario == terceiroUsuario}")
    println("----------------------------------------------------------------------------------")
    // hashCode() function
    println(primeiroUsuario.hashCode())                               
    println(segundoUsuario.hashCode())
    println(terceiroUsuario.hashCode())
    println("----------------------------------------------------------------------------------")
    // copy() function
    println(primeiroUsuario.copy())                                  
    println(primeiroUsuario === primeiroUsuario.copy())                          
    println(primeiroUsuario.copy("Alexandro da Silva"))                             
    println(primeiroUsuario.copy(id = 11))                             
    println("----------------------------------------------------------------------------------")
    println("name = ${primeiroUsuario.component1()}")                 
    println("id = ${primeiroUsuario.component2()}")
 }
