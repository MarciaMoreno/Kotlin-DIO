/*
 * Exemplo de uso da função com While e Do-While... 
*/

fun venderBolo() = println("Bolo vendido com sucesso!")
fun fazerBolo() = println("Bolo feito com sucesso!")

fun main(){
    var bolosVendidos = 0
    var bolosFeitos = 0
    
    while(bolosVendidos < 5){
		venderBolo()
        bolosVendidos++
    }
    do{
        fazerBolo()
        bolosFeitos++        
    }while (bolosFeitos < bolosVendidos)
}
