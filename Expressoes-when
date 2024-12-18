/* Rodando uma Simples 
 * receita de bolo de cenoura com chocolate 
 * TESTANDO EXPRESSÕES "WHEN" E FUNÇÕES NAS CLASSES DE INFERÊNCIAS*/

class MyClass(val modoDeFazer: String)

class MyCake(val cobertura: String)

fun cases(obj:Any){
    when(obj){
        10 -> println("BOLO DE CENOURA COM CHOCOLATE")
        11 -> println("2 1/2 xícaras de farinha de trigo")
        12 -> println("1 1/2 xícara de áçucar")
        13 -> println("2 cenouras grande picadas")
        14 -> println("1/3 de xícara de óleo")
        15 -> println("1 colher de fermento")
        16 -> println("1 barra de chocolate ao leite")       
	}
}

fun main() {
    cases(10);cases(11);cases(12);cases(13);cases(14);cases(15);cases(16)
   
    val myclass = MyClass("Modo de Preparo: Bata todos os ingredientes no liquidificador menos o chocolate,")	
    val myclass2 = MyClass("certifique-se que toda a cenoura esteja bem rala e finalmente retire para uma tigela.")    
    val myclass3 = MyClass("Em seguida unte uma forma e dispense a massa, leve ao forno pre-aquecido em 180º.")
    val myclass4 = MyClass("Após 30 minutos se certifique com um palito que o interior esta assado, desligue.")
    println(" ")
    println(myclass.modoDeFazer) 
    println(myclass2.modoDeFazer) 
    println(myclass3.modoDeFazer)
    println(myclass4.modoDeFazer)
    println(" ")
    val mycake = MyCake("COBERTURA: Derreta o chocolate em banho maria, despeje sobre o bolo, espere esfriar, ESTÁ PRONTO!...")
	println(mycake.cobertura)
}
