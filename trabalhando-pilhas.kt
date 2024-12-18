class MutableStack<E>(vararg items: E){
	private val elements = items.toMutableList()
    	fun push(element: E) = elements.add(element)
        fun peek(): E = elements.last()
        fun pop(): E = elements.removeAt(elements.size - 1)
        fun isEmpty() = elements.isEmpty()
        fun size() = elements.size
    override fun toString() = "Lista dos Convidados para mesa: (${elements.joinToString()})"
}

fun main(){
    val mesaGrupoA = MutableStack("Sonia","Paulo","Carlos","Antônio","Sousa")
    println("Mesa A: "+mesaGrupoA)
    
    val mesaGrupoB = MutableStack("Mirian","Carlos","Priscila","Ana","Ines")
    println("Mesa B: "+mesaGrupoB)
    
    val mesaGrupoC = MutableStack("Sidinei","Mauricio","Edgar","Fabricio","Amanda")
    println("Mesa C: "+mesaGrupoC)
    
    // Inserindo mais convidados na mesa do grupo B
    mesaGrupoB.push("Maria")
    println(mesaGrupoB)
    
    //Removendo convidado da mesa do grupo C
    mesaGrupoC.pop()
    println(mesaGrupoC)
    
   for(i in 1..mesaGrupoA.size()){
		println("pop():${mesaGrupoA.pop()}")
        println(mesaGrupoA)
   }
   for(i in 1..mesaGrupoB.size()){
		println("pop():${mesaGrupoB.pop()}")
        println(mesaGrupoB)
   }
   for(i in 1..mesaGrupoC.size()){
		println("pop():${mesaGrupoC.pop()}")
        println(mesaGrupoC)
   }
    
}
