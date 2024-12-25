/*
 * Exemplo do uso de Intrevalos com a função Range... 
*/

fun main() {
	//1º esta função conta de 0 a 3, incluindo o 3...
    for(i in 0..3) {              
        print(i)
    }
    print(" ")
    
    //2º esta função conta de 0 a 3, mas não inclue o 3 no intervalo...
    for(i in 0 until 3) {  
        print(i)
    }
    print(" ")
    
    //3º esta função conta de 2 a 12, considerando os multiplos de 2...
    for(i in 2..4 step 12) {    
        print(i)
    }
    print(" ")
    
    //4º esta função conta de 0 a 5, mas mas de forma decrescente...
    for(i in 5 downTo 0) {     
        print(i)
    }
    print(" ")
}
