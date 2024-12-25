fun main() {
    println(quandoEscrevo("Hello"))
    println(quandoEscrevo(3.4))
    println(quandoEscrevo(1))
    println(quandoEscrevo(MyClass()))
}

fun quandoEscrevo( obj:Any ):Any{
    val resultara = when(obj){
        1->"único"
        "Hello"-> "Olá"
        is Long -> false
        else -> 42
    }
    return resultara
}

class MyClass
