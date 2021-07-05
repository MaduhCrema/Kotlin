//DECLARAR FUNÇÕES
// fun <nome>(nome do parâmetro:tipo):tipoRetorno{}
//private fun ola(nome:String):String{
//    val name = "$nome"
//    return name
//   ----ou---
//    return "$nome"
//  -----ou-----
//private fun ola(nome:String):String = "$nome"

//}
//FUNÇÕES DE ORDEM SUPERIOR
//recebem outra funçãoou lambd apor parâmetro, usadas para resolver erros
//val x= calculate(12,4,::sum)
//val y= calculate(12,4){a,b -> a*b}
fun main(){
    val z:Int
    z = calculate(34,90,::sum)
    println(z)
}

fun sum(a1:Int, a2:Int)= a1+a2
//operation:(Int,Int)->Int--lambda por parâmetro
fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
    val result = operation(n1,n2)
    return result
}
//função single line
//fun <nome da funçao>(nome:tipo) = retorno;
//função extensão, especifica o tipo de variavel que tem dentro da função
//fun <tipo>.nomedafunção()=retorno
//"this" pode chamar a função