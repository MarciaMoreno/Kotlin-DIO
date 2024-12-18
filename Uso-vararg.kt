fun main() {
    fun umaMensagem(vararg mensagem: String){
        for(biblia in mensagem)println(biblia)
    }
    fun umaMensagemComPrefixo(vararg mensagem: String, prefixo: String){
        for(biblia in mensagem)println(prefixo + biblia)
    }
    
    umaMensagemComPrefixo(
    	"versículo 04","versículo 05","versículo 06","versículo 07",
        prefixo = "Salmos 23: "
    )
    fun Log(vararg entries: String){
        umaMensagem(*entries)
    }
}
