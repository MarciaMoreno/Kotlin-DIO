/*
 * VAR é uma variável mutável 
 * VAL é uma variável imutável
 */

fun somaCondicao() = false

fun main() {
	val d: Int
    if(somaCondicao()){
    	d = 100
    }else{
        d = 200
    }
   	println(d)    
}
