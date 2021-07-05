//CARA OU COROA
fun main(){
    val moeda = coin()
    println("Cara ou Coroa?")
    println("Resultado = ${moeda.roll()}")
}

class coin(){
    val coin = listOf("Cara","Coroa")
    
    fun roll():String{
        return(coin).random()
    }
}