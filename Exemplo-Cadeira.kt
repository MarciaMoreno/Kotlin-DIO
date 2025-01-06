fun main() {
    val cad01 = CadeiraDeEscritorio()
    val qtdDeRodinhas = 5 
    val terApoioDeCabeca = true
    println("CADEIRA DE ESCRITÓRIO - Céu Noturno")
    println("Material da Cadeira: "+cad01.material)
    println("Cor: "+cad01.cor)
    println("Quantidade de Rodas: "+cad01.qtdDeRodinhas)
    println("Possui apoio de cabeça?: "+cad01.terApoioDeCabeca)
    println("-----------------------------------------------------------------------------------------------")
    val cad02 = CadeiraGamer()
    println("CADEIRA GAMER - Saturno in Dark")
    println("Material da Cadeira: "+cad02.material)
    println("Cor: "+cad02.cor)
    println("Quantidade de Rodas: "+cad02.qtdDeRodinhas)
    println("Possui apoio de cabeça?: "+cad02.terApoioDeCabeca)
}

interface Cadeira{
    val cor: String
    val material: String 
    
    fun levantar()
    fun sentar()
}

open class CadeiraDeEscritorio : Cadeira{
	  override val material: String = "Veludo Sintético, com Estofamento acetinado"
    override val cor: String = "Preto Azulado"
    val qtdDeRodinhas: Int = 5 
    val terApoioDeCabeca: Boolean = true
    
    fun levantarAssento(cm: Int){
        println("Puxando a alavanca SENTIDO PRA CIMA")
    }
    fun abaixarAssento(cm: Int){
		println("Puxando a alavanca SENTIDO PRA BAIXO")
    }
    override fun sentar(){

    }
    override fun levantar(){
        
    }
}

class CadeiraGamer : CadeiraDeEscritorio() {
    override val material: String = "Couro Sintético, com Estofamento Anti-água"
    override val cor: String = "Azul Petróleo"
    var qtdDeRodinhas2: Int = 3
    var terApoioDeCabeca2: Boolean = false
    val corDoLed: String = ""    
    fun acenderLed(){
		println("Clicando no botão... LUZES ACESAS!...")
    }
    fun apagarLed(){
        println("Clicando no botão... LUZES APAGADAS!...")
    }
    override fun sentar(){

    }
    override fun levantar(){
        
    }
   
    
}

