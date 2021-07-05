fun main(){
    /**while(condição){

    }

    do{

    }while(condição)**/
    for(i in 0..20 step 2){
        println(i)
    }
    /** in,valor inicial ate o final, pode ser substituido por :
    until - conta do valor inicial ate n-1
    downto - decrescente
    step- determina o intervalo da contagem**/
}

fun letter(){
    val sArray = "Olha essa string!"
    for(i in sArray){
        println(i.toUpperCase())
    }
}