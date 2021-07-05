//concatenação 
fun main(){
val name = "maduh"
val ola = "ola"

println(ola + name)
//utiliza chaves quando quer usar algum metodo junto com a variavel da string
println("${ola}, ${name.capitalize()}!")//.capitalize, deixa a primeira letra maiúsucla
println("Bem vindo(a), $name!")
//EMPITY ou BLANK
val s= ""
val j="    "
println(s.isEmpty())
println(s.isBlank())
println(j.isEmpty())
println(j.isBlank())
println(s.length)//mostra o tamalho dela
println(j.length)//mostra o tamalho dela
}
//----------funções para strings---------------------
//capitalize()-deixa a primeira letra maiúsucla
//decapitalize()-deixa a primeira letra minuscula
//toUpperCase()-deixa tudo maiusculo
//toLowerCase()-deixa tudo minusculo
//****remove espaços vazios, e carcateres inadequados na string****
//trimEnd()-
//trimStart()-
//trim()-
//***substituir caracteres***
//replace(x,y)
//****formatação outros valores para padrao de uma string*****
//"padrão ${valor que quero alterar}.format(valor)"
//----EMPITYXBLANK-------retorna booleana
 //empty=vazia sme nada de caracter
 //blank=esta branca

