fun main() {   
    val age = 24
    val layers = 5
    printfaixa(1)
    printcakecandles(age)//chama a função quantas vezes necessária()
    printcaketop(age)
    printcakebottom(age,layers)
}
 fun printcaketop(age:Int){
        repeat(age+2){
            print("=")
        }
        println("")
    }
    fun printcakecandles(age: Int){
         print (" ")
        repeat(age){
            print(",")
        }
        println()//linha vazia
        
        print (" ")//espaço no começo e final da linha
        repeat(age){
            print("|")
        }
        println()
    }
    
  fun printcakebottom(age: Int,layers: Int){
      repeat(layers){
      repeat(age+2){
          print("@")
        }
      println()      
      }
  }
  fun printfaixa(age: Int){ 
      print("   ")
      repeat(1){
          print("Happy Birthday Maduh")
        }
      println()
  }
   