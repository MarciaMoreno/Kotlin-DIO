fun comer() = println("Comendo um Bolo")
fun fazer() = println("Fazendo um Bolo")

fun main(){
	  var bolosComidos = 0
    var bolosFeitos = 0
    
    while( bolosComidos < 5){		
        bolosComidos++
    }
    do{
        fazer()
        comer()
        println(" ")
        bolosFeitos++        
    }while(bolosFeitos < bolosComidos)
}
