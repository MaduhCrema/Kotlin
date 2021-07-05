fun main() {
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    val luckyNumber = 4
    
    when(diceRoll){
       luckyNumber -> println("You WIn!!!") 
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")

    }
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
//ELVIS OPERATOR--verifica se o valor é nulo e apresneta uma opção caso seja
val a:Int? = null// seanalisa se a é nulo
var number = a ?: 0//se o valor de a for nulo então recebe zero, s enão for recebe a
//atribuição de valor
val Min_Value = if(a>b){b}