/*
 * Trabalhando com Valores de parâmetro padrão 
 * e nomeando argumentos matematicos
 */


fun soma( x: Int, y: Int) = x + y

fun multiplica( x: Int, y:Int) = x * y

fun concatena( x: String, y: String){
	  print(x)
    print(y)
}

fun main() {
    println(soma(2,4))
    println(multiplica(1,4))
    val x = "Sara, "
    val y = "já está acordada!..."
    return concatena(x,y)
    
}
