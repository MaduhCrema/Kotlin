fun main(args: Array<String>) {
  print("Por favor, informe a sua idade: ")
  // vai ler o nome e guardar na variável nome
  var nome = readLine()!!.toInt()
  println("Olá, $nome. Bem-vindo(a) ao Kotlin.")
}

/**import Java.util.Scanner

fun main(vararg args: String) {
  val input = Scanner(System.`in`)
  val a = input.nextInt()
  val b = input.nextInt()
  println(a + b)
}

ou 
/**
with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    println(a + b)}

 **/