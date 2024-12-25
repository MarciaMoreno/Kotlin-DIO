fun main() {

    fun getNullableLength(ns:String?):Int{
        println("for \"$ns\":")
        return ns?.run{
            println(isEmpty())
            println("\t Tamanho = $length")
            length
        }?: 0
    }
    print(getNullableLength(null))
    println("-----------------------------------------------------------------------------")
    print(getNullableLength(" "))
    println("-----------------------------------------------------------------------------")
    print(getNullableLength("Tenha um bom dia"))
}
