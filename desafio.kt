enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.hashCode()} matriculado na Formação $nome")
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    
    val conteudo1 = ConteudoEducacional("Introdução à Programação")
    val conteudo2 = ConteudoEducacional("Estruturas de Dados")
    val conteudo3 = ConteudoEducacional("Banco de Dados")
    
    val formacao1 = Formacao("Desenvolvimento Web", listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Ciência de Dados", listOf(conteudo1, conteudo3))
    
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario1)
}
