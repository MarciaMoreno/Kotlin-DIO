/*Fazendo uso da função "when" 
 * para rodar uma simples
 * receita de bolo de cenoura com Chocolate
*/
class MyClass(val modoDeFazer: String)
class MyCake(val cobertura: String)

fun cases(obj: Any){
	when(obj){
		10-> println("BOLO DE CENOURA COM CHOCOLATE")
        11-> println("2 1/2 de farinha de trigo")
        12-> println("2 1/2 de xícara de açúcar")
        13-> println("2 cenouras grande picadas")
        14-> println("1/3 de xícara de óleo")
        15-> println("1 colher de fermento")
        16-> println("1 barra de chocolate ao leite")        
    }
}

fun main(){
    cases(10);cases(11);cases(12);cases(13);cases(14);cases(15);cases(16);    
    val myclass = MyClass("Modo de Preparo: Bata todos os ingrediente no liquidificador, exceto o chocolate.")
    val myclass1 = MyClass("Bata muito bem ate ficar homogêneo e retire para uma tigela.")
    val myclass2 = MyClass("Em seguida unte uma forma dispense a masse e coloque no forno pré-aquecido a 180º.")
    val myclass3 = MyClass("Após 30 minutos insira um palito e caso saia seco está pronto.")
    
    println(" ")
    println(myclass.modoDeFazer)
    println(myclass1.modoDeFazer)
    println(myclass2.modoDeFazer)
    println(myclass3.modoDeFazer)
    println(" ")
    val mycake = MyCake("Cobertura: Derreta o chocolate em banho-maria, espere esfriar, reparta e sirva!... ")
    println(mycake.cobertura)
}



















