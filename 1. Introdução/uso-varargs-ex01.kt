fun main() {

    fun saudacao(vararg mensagem: String) {                            
        for (biblia in mensagem) println(biblia)
    }
    
    fun saudacaoComPrefixo(vararg mensagem: String, prefixo: String) {  
        for (biblia in mensagem) println(prefixo + biblia)
    }
    saudacaoComPrefixo(
        	" versículo 03 - Refrigera a minha alma; guia-me pelas veredas da justiça, por amor do seu nome.",
            " versículo 04 - Ainda que eu andasse pelo vale da sombra da morte, não temeria mal algum, porque tu estás comigo; a tua vara e o teu cajado me consolam.", 
            " versículo 05 - Preparas uma mesa perante mim na presença dos meus inimigos, unges a minha cabeça com óleo, o meu cálice transborda.", 
            " versículo 06 - Certamente que a bondade e a misericórdia me seguirão todos os dias da minha vida; e habitarei na casa do Senhor por longos dias.", 
            prefixo = "Salmos 23: " 
    )   
}
