fun main() {
    var num1 = 34.5F
    var num2 = 77.8F //.F para especificar que é float
       
    println("Qual operação deseja fazer?")
    println("============================")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    println("5 - Módulo")
    
    var operacao = 1
    val resultado = when(operacao){
        1-> num1 + num2
        2-> num1 - num2
        3-> num1 * num2
        4-> num1 / num2
        else -> num1 % num2
    }
    	println("============================")
        println("Operação = ${operacao}")
        println("Resultado = ${resultado}")    
        println("============================")
}