//COMO DECLARAR CORRETAMENTE VARIAVEIS NO KOTLIN?
//variavel global, definida na compilaçao
const val MAX_AGE= 68
fun main() {
    println(MAX_AGE)
    //variavel local, definida e alterada na execução
    var currentAge=22
    currentAge=11
    //outra forma de definir variaveis
    var idade:Int
    idade = 32    
    println(idade)
    //variavel local, definida na execução
    val otherAge=12
    println(currentAge)
    println(otherAge)
    //conversão de tipo de dados
    var currentYear = "que ano hein?!"
    currentYear = 2021.toString()+" vai ser melhor"
    println(currentYear)
    //VARIAVEIS NÃO PODE SEREM DECLARADAS SEM TIPO E SEM ATRIBUIÇÃO
    //atribui valor nulo
    var month: Int? = null
    println(month)
} 

