# Informações úteis KOTLIN
## Segurança no Koltin
*comunicação segura* = proteger os dados do app, de uma forma atualizada

*oferecer permissões corretas*

### Dicas de segurança
* usar o armazenamento interno e exeterno
   ##### Obs: não armazene informações pessoais, pois são de fácil acceso
* usar provedores de conteúdo
* usar permissões

### Segurança com dados
#### *HTTPS e SSL*
* Configurações de segurança na rede
#### *SafetyNet*
* Protege contra ameaças de segurança na rede

### Criptografia
* Android KeyStore = especificar provedor
* Confirmação protegida por android
* Funcionalidade suspensas

### Dicas com o google play
* App security improvement
   #### *te envia notifiações com os problemas de segurança do app*
* PHAs, aplicações potencialmente nocivas ou maliciosas
  #### *PHAs desejados pelo usuário*
  #### * PHAs são classificados
### Android App Bundle
#### *O Android App Bundle é o formato de publicação recomendado no Google Play. Ao publicar usando pacotes de apps, você pode reduzir o tamanho e simplificar as versões do app, além de ativar recursos avançados de distribuição.*
#### saiba mais em **https://developer.android.com/guide/app-bundle**
### Google Play Instant
#### *O Google Play Instant permite que aplicativos e jogos nativos sejam iniciados em dispositivos sem ter que instalá-lo primeiro. Você pode criar esses tipos de experiência, chamados de apps instantâneos e jogos instantâneos, usando o Android Studio. Ao permitir que os usuários executem um app ou jogo instantâneo, ação conhecida como fornecer uma experiência instantânea, você melhora a descoberta do seu app ou jogo, o que ajuda a gerar mais instalações e conquistar mais usuários ativos.*
####  saiba mais em **https://developer.android.com/topic/google-play-instant/overview**
## Variáveis

* val(camelCase) -> não pode ser mudada posteriormente
* var(camelCase) -> variavel que pode ser alterada
* Const Val(SNAKE_CASE) -> Valor atribuido durante a compilação -> Usado para consultas/validações

* ${variable} -> usar variavel dentro de uma declaração

## Funções

* Prefixo fun nomeDaFunção(nome:Tipo):TipoRetorno{}
* Anonimas, single-line, inline, extensões

### Funções de Ordem Superior

* Recebem outra função ou lambda por parametro
* Generalização de funções e tratamento de erros

 ```kt
fun main (){

    val z:Int

    z = calculate(34,98, ::sum)
    println(z)

}

    fun sum(a1:Int, a2:Int) = a1.plus(a2)

    fun calculate(n1:Int, n2:Int, operation:(Int, Int) -> Int):Int{

        val result = operation(n1,n2)
        return result

    }
```

### Nomear funções

* Os nomes das funções quase sempre começam com uma letra minúscula e um verbo, e o nome precisa descrever o que a função faz.
* A segunda palavra dentro do nome começa com letra maiúscula. Esse estilo é chamado de concatenação e facilita bastante a leitura dos nomes.

## Funções single-line

* Uma linha após a declaração
* Infere o tipo
* Fun nomeDaFunçao(nome:Tipo) = retorno;

## Funções/Extensões

* Fun Tipo.nomeDaFuncao();
* Cria função que só pode ser chamada por um tipo, cujo valor pode ser referenciado dentro da função através da palavra **this**

## Ordenação de dados
```kt
val values = listOf(1,3,4,5)
values.sort()
```
## Estruturas de Controle

* Tanto para controle quanto para atribuição
* if/else, when , elvis operator

### When

* Equivalente ao switch
* Aceita tanto valores quanto condicionais
* Aceita range como case

```kt
when{

    case1 -> {}
    case2 -> {}
    case3 -> {}
    else  -> {}
}
```

### Elvis Operator

* O mais próximo de um operador ternário
* Verifica se o valor é nulo e apresenta uma opção caso seja
* Pode ser encadeado

```kt
val a:Int? = null
val c:Int? = 9
var number = a?: b?: 0
```

## Atribuição

* Valor atribuido deve estar na ultima linha do código

## Estruturas de Repetição

* While, do..while, for e forEach
* Estruturas semelhantes as ostras linguagens
* Aceita os comandos in, range, until, downTo e step

### For

```kt
for(i in/until/downTo(faixa de valores/condicional) 0..20 step 2(intervalo de contagem)){
    println(i)
}
```
### .forEach
```kt
fun main(){
    val values = IntArray(5)

    values[0]= 1
    values[1]= 3
    values[2]= 2
    values[3]= 6
    values[4]= 5

    values.forEach{ it:Int
        println(it)
    }
            OU

     values.forEach{ cont ->
        println(cont)
    }
}
```
### .forEachIndexed
```kt
 val valores = DoubleArray(size 3)
    valores[0]=1233.54
    valores[1]=1200.78
    valores[2]=1500.80
    
//mexe com cada indice separadamente
    valores.forEachIndexed{ index, valor ->
        valores[index] = valor*1.1
    }
```
## Tipos de Dados

* Int
* Long
* Float
* Double
* Array
* Boolean
* Char
* Byte
* Short
* Null

### Converter Dados

* toByte()
* toShort()
* toInt()
* toLong()
* toFloat()
* toDouble()
* toChar()

### Valores Máximos

```kt
println(Int.MAX_VALUE)
println(Float.MAX_VALUE)
println(Double.MAX_VALUE)
println(Float.MAX_VALUE)
println(Byte.MAX_VALUE)
```

### Valor Nulo

* Qualquer tipo pode ser nulo através da interrogação (?)
* Inferencia de tipo não atribui nulo

## Operadores Aritméticos

* Soma
    * Expressão a + b
    * Comando a.plus(b)
    * Atribuição a += b

* Subtração
    * Expressão a - b
    * Comando a.minus(b)
    * Atribuição a -= b

* Multiplicação
    * Expressão a * b
    * Comando a.times(b)
    * Atribuição a *= b

* Divisão
    * Expressão a / b
    * Comando a.div(b)
    * Atribuição a /= b

* Resto
    * Expressão a % b
    * Comando a.mod(b)
    * Atribuição a %= b

## Operações maior,menor,média e filtro
```kt
//maior
println("Maior salario: ${salarios.max()}")
//menor
println("Menor salario: ${salarios.min()}")
//média
println("Média salarial: ${salarios.average()}")
// filtro
    val salmaiorque2500 = salarios.filter{it > 2500}
    println("====================")
    salmaiorque2500.forEach{
        println(it)
    }
```
### As melhores expressõe spara maior ou menor são essas
```kt
//maior
println("Maior salario: ${salarios.maxOrNull()}")
//menor
println("Menor salario: ${salarios.minOrNull()}")
```
## Operações count, find e any
```kt
//se a expressão for verdadeira(boleana), imprime a quantidade de elementos
    println(salarios.count{it in 2500.0..5000.0})
//acha o que eu procuro, no caso o valor 1345.75, retorna o valor
    println(salarios.find{it == 1345.75})    
//caso que eu nao tenho o valor, imprime "NULL"
    println(salarios.find{it == 1145.75})
    
//vai procurar dentro da lista um elemento que corresponda com a expressão, retorna exp. booleana
    println(salarios.any{it == 1345.75})
```
## Operações com listOf,sortedBy e groupBy
### listOf é uma lista não mutável
```kt
fun main() {
    val joao = funcionario("joao", 1200.0, "CLT")
    val pedro = funcionario("pedro", 1100.90,"PJ")
    val maria = funcionario("maria", 1250.45,"CLT")

    //inicializar a lista
    val funcionarios = listOf(joao, pedro, maria)
        funcionarios.forEach{
            println(it)
       }
    println("-------------------------")
    println(funcionarios.find{it.nome == "maria"})
    println("------------------------")
    //ordenar qual parametro, no caso salario e imprime
    funcionarios.sortedBy{it.salario}.forEach{println(it)}
    println("------------------------")
    //agrupa por parametro, no caso tipoContratacao  e imprime
    funcionarios.groupBy{it.tipoContratacao}.forEach{println(it)}
}

data class funcionario(
    val nome:String, 
    val salario:Double,
    val tipoContratacao:String
    ) {
    // função que para printar de formar organizada
    override fun toString(): String =
            """
                nome: $nome
                salário: $salario  
                          
            """.trimIndent()
}
```
## setOf
```kt
fun main() {
    val pedro = funcionario("pedro",1500.0,"PJ")
    val marcia = funcionario("marcia", 1340.80,"CLT")
    val gabriel = funcionario("gabriel",1230.90,"PJ")
// setOf serve para criar um conjunto com os elementos que você quer
    val  funcionarios1= setOf(pedro,gabriel)
    val funcionarios2 = setOf(marcia)
    //uniao dos dois conjuntos
    val result = funcionarios1.union(funcionarios2)
    result.forEach{println(it)}
// subtração de conjuntos
    println("-----------------")
    val  funcionarios3= setOf(pedro,gabriel,marcia)
    val resultsub = funcionarios3.subtract(funcionarios2)
    resultsub.forEach{println(it)}
    //mostra a intersecção dos dois conjuntos
    println("------------------")
    val resultinter = funcionarios3.intersect(funcionarios2)
    resultinter.forEach{println(it)}
}
```
## mapOf
```kt
fun main() {
// cria  parametros
    val pair: Pair<String, Double> = Pair("João", 1500.90)
//alocação de mapa de cada pair
    val map1 = mapOf(pair)
//inicialização com dois "it", onde tem o nome e o valor
    map1.forEach{(k, v) -> println("Chave: $k e valor: $v")}
//outra forma  de inicializar o mapa por infix
    val map2 = mapOf("pedro" to 2500.0, "maria" to 3450.90)
    map2.forEach{(k, v) -> println("Chave: $k e valor: $v")}
}
```
## Operações com setOf, mapOf
### mutablelistOf é uma lista mutável
### *setOf*
```kt
fun main(){
    val joao = funcionario("joao", 1200.0, "CLT")
    val pedro = funcionario("pedro", 1100.90,"PJ")
    val maria = funcionario("maria", 1250.45,"CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("------------------")
    //novo funcionario na lista mutável
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}
    println("------------------")
   // exclui funcionaio
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("---------SET---------")
    val funcionarioset = mutableSetOf(joao)
    funcionarioset.forEach{println(it)}

    println("------------------")
    //adicionou mais funcionario ao setOf mutável
    funcionarioset.add(maria)
    funcionarioset.add(pedro)
    funcionarioset.forEach{println(it)}
    println("------------------")
    //removeu maria do setOf
    funcionarioset.remove(maria)
    funcionarioset.forEach{println(it)}

}
```
### *mapOf*
```kt

class repositorio<T> {
    //T = valor generico
    private val map = mutableMapOf<String, T>()

    fun create(id:String,value:T){
        //put
        map[id] = value
    }
    //retornar o valor de acordo com o  Id
    fun findById(id:String) = map[id]

    //traz todos os valores de T, ou seja todos os funcionarios
    fun findAll() = map.values

    //exclui os elementos
    fun remove(id:String) = map.remove(id)

}
----------------------------------------------
fun main() {
    val joao = funcionario("joao", 1200.0, "CLT")
    val pedro = funcionario("pedro", 1100.90,"PJ")
    val maria = funcionario("maria", 1250.45,"CLT")

    val repositorio = repositorio<funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(pedro.nome,pedro)

    println(repositorio.findById(joao.nome))

    println("-----------------------------")
    repositorio.findAll().forEach{println(it)}

    println("-----------------------------")
    println("Removida: ${repositorio.remove(maria.nome)}")

}
```
## Funções estendidas
### Utilizada para criar funções para uma classe específica, sem precisar herdar a classe.
```kt
import java.math.BigDecimal
// chama array, pois a lista é de arrayOf, bigDecimal o Tipo
//.somatoria() o nome da função
//this.reduce acumula os elementos na somatoria, acc é onde acumular e soma o valor
fun Array<BigDecimal>.somatoria()= this.reduce{
    acc,valor -> acc + valor
}
//.media() nome da função
//se a media estiver vazia o bigDecimal recebe zero
//se não ocorre a somatoria / pelo tamanho do Array e convertido para bigDecimal
fun Array<BigDecimal>.media()=
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()


fun main() {
    val salarios = arrayOf("2000".toBigDecimal(),"4500".toBigDecimal(),"1290".toBigDecimal())

    println("Soma = ${salarios.somatoria()}")
    println("Média = ${salarios.media()}")
}
```
## Operadores Comparativos

* Maior / Menor
    * Expressão a > b ou a < b
    * Comando a.compareTo(b) > 0
    * Comando a.compareTo(b) < 0


* Maior igual / Menor igual
    * Expressão a >= b ou a <= b
    * Comando a.compareTo(b) >= 0
    * Comando a.compareTo(b) <= 0

* Igual
    * Expressão a == b
    * Comando a.equals(b)
    * Retorna booleano

* Diferente
    * Expressão a != b
    * Comando !(a.equals(b))

* Comandos compareTo() retorna (-1) menor que / (0) igual / (1) maior

* Comandos equals() retorna valor booleano

* Operadores retornam valores booleanos

## Diferença Empty x Blank

* Métodos de comparação

* Se o tamanho da string for 0 -> Empty e Blank
* Se for > 0 mas todos os caracteres for espaços em branco -> Blank

## Operadores Lógicos

* E(&&)
    * Comando and

* OU (||)
    * Comando or

* Expressões entre parenteses

## In e Range

* Contém (in)
* Não contém (!in)
* range/Faixa de valores (int..int)

```kt
const val MAX_AGE = 68
const val MIN_AGE = 16

fun main (){

    var num: Int? = null
    println(num)

    var age = (10..100).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age >=  MIN_AGE && age <= MAX_AGE)
}
```

## Manipulação de Strings

* Concatenada com plus/+
* Array de char

### Indexação

* String como array
* First(), last(), String.length. String[index]

### Concatenação

* plus/+
* ${} para concatenar com variaveis

### Formatação

* capitalize()-deixa a primeira letra maiúsucla
* decapitalize()-deixa a primeira letra minuscula
* toUpperCase()-deixa tudo maiusculo
* toLowerCase()-deixa tudo minusculo
* remove espaços vazios, e carcateres inadequados na string
    * trimEnd()-
    * trimStart()-
    * trim()-
* substituir caracteres
    * replace(x,y)
* formatação outros valores para padrao de uma string*
    * "padrão ${valor que eu quero}.format(valor)"

```kt
fun main (){
    
    val name = "Ana  "
    val s = "Olá"
    val minu = "ana"

    println()

    println(s + name)
    // OláAna
    println("${s}, ${name.trimEnd()}!")
    // Olá, Ana
    println("Bem vinda(o), $name!")
    // Bem vinda(o), Ana  !
    println("Bem vinda(o), ${minu.capitalize()}!")
    // Bem vinda(o), Ana!

    println()
    println("Blank or Empty")
    println()

    val strings = ""

    println(strings.isEmpty())
    //true
    println(strings.isBlank())
    //true
    println(strings.isNullOrBlank() || s.isNullOrEmpty())
    // true

    val strings2 = "   "
    println(strings2.isEmpty())
    // false
    println(strings2.isBlank())
    // true

}
```
# Classes
### Kotlin não é uma linguagem em que todo o código precisa estar contido em uma classe. Ela incorpora a programação procedural e funcional e, caso seja necessário, se pode utilizar os objetos nativos, implementando as regras de negócio do projeto com funções. Porém, quando trabalhamos de forma orientada a objetos nessa linguagem devemos nos atentar para os diversos recursos que ela dispõe para a escrita de classes, assunto tratado aqui.

### Uma classe é um bloco de construção de software fundamental, encontrado na grande maioria das linguagens orientadas a objetos e, dessa forma, também presente em Kotlin. Elas são usadas para criar novos tipos de dados, utilizando uma estrutura composta por métodos e variáveis que podem possuir os seus próprios tipos.

### *Abaixo, na Figura 1 vemos uma visão geral da estrutura de uma classe em Kotlin.*

![Alt Text](https://www.devmedia.com.br/arquivos/Salas/Linguagem/kotlin/113/classes_artigo.png)

## Declaração de classes

### Em Kotlin, um arquivo pode conter diferentes declarações de classes, as quais são feitas utilizando a palavra reservada class. Abaixo apresentamos uma declaração de classe feita da forma mais simples possível em Kotlin.

## class Medicamento

### No exemplo acima, uma vez que a classe Medicamento não possui um corpo, podemos omitir as chaves que estariam na frente do seu nome.
## Construtores

### Um construtor é uma função especial da classe, utilizada na criação e inicialização dos objetos derivados dela.

### Kotlin distingue os construtores de uma classe entre primários e secundários. O construtor primário de uma classe faz parte do seu cabeçalho e pode conter apenas uma lista de parâmetros, assim como apresentado abaixo.
```kt
class Medicamento(val formula: String, val posologia: String)
```
### Dado que o construtor primário não pode conter nenhum código, uma classe pode conter um ou mais blocos de inicialização, que são executados na ordem como são declarados no corpo da mesma. Nesses blocos de inicialização, conforme visto no Código 1, podemos acessar quaisquer parâmetros que estejam presentes no construtor primário. A relação entre construtor primário e propriedades será detalhada ainda neste artigo.
```kt
class Medicamento(val formula: String, val posologia: String) {
     init {
         require(formula.trim().length > 0) {
            "Informe uma fórmula"
         }

         require(posologia.trim().length > 0) {
            "Informe uma posologia"
         }
     }
}
```
*Código 1. Blocos de inicialização*

### Além do construtor primário, uma classe também pode declarar um ou mais construtores secundários. Esses, por sua vez, sempre devem utilizar a palavra reservada constructor em suas declarações, mesmo quando um modificador de acesso for omitido ou nenhuma anotação for utilizada, como mostra o Código 2.
```kt
class Medicamento {
    constructor(formula: String, posologia: String)
}
```
*Código 2. Construtor secundário*

### No caso de uma classe possuir mais de um construtor, sendo um deles primário, cada construtor secundário deve delegar ao construtor primário. Quando ambos os construtores estiverem na mesma classe, a delegação de um construtor para o outro é feita com a palavra reservada this.

### Podemos utilizar valores padrão do construtor delegado de uma classe. Para demonstrar isso vamos adicionar um terceiro parâmetro no construtor para a contraindicação do medicamento. Considerando que a classe Medicamento possa ser inicializada sem um valor para essa propriedade, caso no qual o mesmo passará a ser uma mensagem padrão, poderíamos modelá-la da seguinte forma apresentada no Código 3.
```kt
class Medicamento(val formula: String, posologia: String, val contraindicacao: String) {

     constructor(formula: String, posologia: String): this(formula, posologia,
          "Este medicamento não é indicado para pessoas alérgicas a $formula")
}
```
*Código 3. Valores padrão do construtor delegado*

### Dessa forma, na delegação do construtor this(formula, posologia, "Este medicamento não é indicado para pessoas alérgicas a $formula") informamos um valor padrão para a propriedade contraindicacao e assim a classe poderá ser instanciada com ou sem esse terceiro parâmetro, como mostra o Código 4.
```kt
val medicamento1 = Medicamento("C8H9NO2", "...")
val medicamento2 = Medicamento("C8H9NO2", "...", "Minha contraindicação")
```
*Código 4. Instanciando uma classe com ou sem parâmetros*

### No exemplo acima, o objeto medicamento1 será iniciado com o valor padrão para a propriedade contraindicacao, que é "Este medicamento não é indicado para pessoas alérgicas a $formula". Para o objeto medicamento2, o valor da propriedade contraindicacao será aquele informado no construtor, que é "Minha contraindicação".
## Construtores e propriedades

### O construtor primário age de forma diferente do construtor secundário quanto a geração de propriedades para a classe na qual eles são declarados. Essa abordagem impede que as propriedades de uma classe variem de acordo com os parâmetros declarados nos construtores, uma vez que a geração de propriedades é limitada ao construtor primário de uma classe.

*Para demonstrar isso observe a declaração da classe Medicamento no Código 5.*
```kt
class Medicamento {
    constructor(formula: String, posologia: String)
}
```
*Código 5.Impedindo as propriedades de variarem*

### Diferentemente do construtor primário, os parâmetros do construtor secundário não gerarão propriedades, visto que ao tentar executar um código como o Código 6, será gerado um erro de compilação.
```kt
val medicamento: Medicamento = Medicamento("", "")
medicamento.formula
```
**Error:(10, 17) Kotlin: Unresolved reference: formula**

*Código 6. Erro de compilação*

### Sendo assim, nesse caso é obrigatório declarar uma propriedade na classe Medicamento, a qual poderá receber o valor do parâmetro do construtor e ser acessada a partir de uma instância, como visto acima.

*Podemos eliminar o erro ao acessar a propriedade formula, conforme o Código 7.*
```kt
class Medicamento {
     val formula: String

     constructor(formula: String, posologia: String) {
        this.formula = formula
     }
}
```
*Código 7. Eliminando o erro de compilação*

### Assim, uma classe em Kotlin pode possuir propriedades declaradas em seu corpo explicitamente. Essas propriedades podem ser mutáveis, quando declaradas com a palavra reservada var, ou somente leitura, quando declaradas com a palavra reservada val. Caso elas sejam declaradas imutáveis, será necessário inicializá-las, o que pode ser feito no construtor secundário da classe, como no exemplo acima.
## Imutabilidade dos parâmetros dos construtores secundários

### Conforme demonstrado anteriormente, os parâmetros do construtor secundário são declarados sem utilizar as palavras reservadas val ou var, como apresentado no Código 8.
```kt
class Medicamento {
    constructor(formula: String, posologia: String)
}
```
*Código 8. Imutabilidade dos parâmetros*

### Caso uma tentativa de fazer o contrário seja feita, digamos declarando a fórmula como val formula: String, um erro de compilação será emitido com a seguinte mensagem apresentada no Código 9.

**Kotlin: 'val' on secondary constructor parameter is not allowed**

**Código 9. Erro de Compilação**

### Em Kotlin, tanto os parâmetros de funções quanto os de construtores são imutáveis por definição, o que elimina a necessidade de se utilizar val ou var nesse caso.

### Em adendo, a utilização de val ou var em construtores é restrita ao construtor primário de uma classe para definir a mutabilidade das suas propriedades, será imutável ou não, dado que apenas ele pode gerar propriedades para uma classe.

### Por exemplo, digamos que a fórmula de um medicamento nunca possa alterada, uma vez que seja definida no momento da criação de uma instância, mas que a sua posologia depende de uma regra externa a essa classe. Dessa forma, podemos modelar a classe Medicamento conforme apresentado a seguir:
```kt
class Medicamento(val formula: String, var posologia: String)
```
### Tendo sido o parâmetro formula declarado imutável, a propriedade homônima da classe Medicamento também será somente leitura. Ao tentar atribuir valor a ela a partir de uma instância o seguinte erro será apresentado:

**Error:(8, 5) Kotlin: Val cannot be reassigned**

### O mesmo erro não ocorrerá ao atribuir valor a propriedade posologia a partir de uma instância da classe Medicamento, uma vez que o parâmetro posologia, presente no construtor primário, foi declarado mutável.
## Instanciando uma classe

### Para criar uma instância de uma classe usamos seu nome e construtor. Em Koltin não utilizamos a palavra-chave new, como mostra o Código 10.
```kt
class Medicamento(val formula: String, val posologia: String) {
}

val medicamento = Medicamento("C8H9NO2", "...")
```
*Código 10. Sem o uso do new*

### Aqui devemos observar que se uma classe possui um construtor, sendo ele primário ou secundário, o mesmo deve ser invocado. Por exemplo, no Código 11 a classe Medicamento possui um construtor secundário, o que torna obrigatório instanciá-la da forma Medicamento("C8H9NO2", "...").
```kt
class Medicamento {
    constructor(formula: String, posologia: String)
}
```
*Código 11. Invocando construtor*

### Caso isso não seja feito e a classe seja instanciada como Medicamento(), sem que os argumentos sejam fornecidos para o construtor, teremos um erro de compilação com a mensagem Error:(10, 35) Kotlin: No value passed for parameter 'formula' Error:(10, 35) Kotlin: No value passed for parameter 'posologia', onde formula e posologia são propriedades da classe.
## Funções membro

### Funções membro são funções declaradas dentro de classes. As regras que aprendemos anteriormente para a escrita de funções também se aplicam aqui com uma exceção, funções membro podem utilizar a palavra-chave this para referenciar a instância atual.

### Funções membro sempre devem ser invocadas a partir de instâncias da classe. No Código 12 vemos um exemplo onde invocamos uma função a partir de uma instância de uma classe Medicamento.
```kt
class Medicamento(val formula: String, val posologia: String) {

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}

fun main() {
    val medicamento = Medicamento("C8H9NO2", "...")

    if (medicamento.contem("C8H9NO2")) {
        println("Este medicamento contém paracetamol")
    }
}
```
*Código 12. Funções membro*

### Observe que na Linha 3 utilizamos this para diferenciar entre a propriedade e o parâmetro formula.

#### Tenha cuidado ao usar this em classes que possuam apenas um construtores secundários, uma vez que eles não geram propriedades e, portanto, devem iniciar a classe ou delegar isso para um outro construtor. Entendido isso, caso uma classe possua apenas um construtor secundário ela deve conter propriedades que precisam ser iniciadas dentro dele.

### Por exemplo, o Código 13 vai falhar ao usarmos a palavra-chave this, pois a classe não possui uma propriedade chamada formula.

```kt
class Medicamento {
    constructor(formula: String, posologia: String)

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}
```
*Código 13. Falha ao usar a palavra-chave this*

#### No Código 13 o erro emitido pelo compilador será Error:(6, 40) Kotlin: Unresolved reference: formula. Para corrigir esse erro a classe precisa iniciar uma propriedade chamada formula no construtor secundário, como mostra o Código 14.
```kt
class Medicamento {
    val formula: String
    val posologia: String

    constructor(formula: String, posologia: String) {
        this.formula = formula
        this.posologia = posologia
    }

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}
```
*Código 14. Iniciando propriedade*

### Contudo, o código acima é desnecessariamente longo e nesses casos podemos declarar a classe com um construtor primário, como vemos no Código 15.
```kt
class Medicamento(val formula: String, val posologia: String) {

    fun contem(formula: String) = this.formula.contains(formula, ignoreCase = true)
}
```
*Código 15. Declara a classe com um construtor primário*

### Sendo assim, o código acima é equivalente ao anterior e também resolve o problema do this, porém de um jeito mais sucinto.
## Construtores e blocos de inicialização

### A delegação de um construtor secundário para o construtor primário ocorrerá como sendo a primeira instrução no construtor secundário. Isso quer dizer que, uma vez que eles passam a fazer parte do construtor primário, cada bloco de inicialização será executado antes de qualquer construtor secundário.

### Fundamentalmente, caso uma classe não possua nenhum construtor e não seja abstrata, um construtor público vazio lhe será atribuído. Supondo que nessa mesma classe não exista um construtor primário declarado, a delegação ocorrerá de forma implícita, como demonstrado no Código 16.
```kt
class Medicamento {
     val formula: String

     constructor(formula: String, posologia: String) {
         this.formula = formula

         println("Construtor secundário")
     }

     init {
         println("Bloco de inicialização")
     }
}
```
*Código 16. Delegação implícita*

### No exemplo acima, não importando a ordem da declaração do construtor secundário e do bloco de inicialização, as mensagens exibidas serão “Bloco de inicialização” e “Construtor secundário”, nessa ordem.
## Níveis de acesso

### Em Kotlin, não informar um nível de acesso para um tipo faz com que o modificador public seja automaticamente aplicado. Além desse, geralmente não utilizado devido a redundância que causa, Kotlin possui três níveis de acesso. Dentre eles, Protected pode ser utilizado apenas por classes aninhadas. Quando utilizado em nível de arquivo, um erro será emitido pelo compilador, como mostra o Código 17.
```kt
protected class Medicamento constructor(val formula: String, var posologia: String)
```
**Error:(3, 1) Kotlin: Modifier 'protected' is not applicable inside 'file'**

*Código 17. Erro do compilador*

### No Código 18 utilizamos o modificador protected, que é sintaticamente permitido porque Tributacao não está em nível de arquivo e é uma classe aninhada em Medicamento.
```kt
class Medicamento {

    protected class Tributacao
}
```
*Código 18. Modificador protected*

### Private é um nível de acesso que restringe o escopo de utilização da classe apenas ao arquivo no qual ela foi declarada.

### Ao tentar utilizar uma classe private fora do arquivo no qual ela foi declarada, um erro será emitido pelo compilador prematuramente, no momento da sua importação, como mostra o Código 19.
```kt
private class Medicamento constructor(val formula: String, var posologia: String)

import br.com.devmedia.kotlin.a.Medicamento

fun main(args: Array) {
     println(Medicamento("C8H9NO2", "...12 anos ou mais variam de 500 a 1000 mg/
     dose com intervalos de 4 a 6 horas..."))
}
```
**Error:(3, 33) Kotlin: Cannot access 
'Medicamento': it is private in file**

*Código 19. Modificador private*
### Em Kotlin, a declaração de um pacote é feita com a palavra reservada package, seguida do nome do pacote. A importação de uma classe de outro pacote é feita com a palavra import, seguida do nome completo da classe.

### O terceiro modificador de acesso é internal, que permite criar uma instância da classe em qualquer lugar no módulo no qual ela foi declarado. Para o Kotlin um módulo é um conjunto de fontes compilados juntos. Isso torna esse comportamento difícil de ser verificado em um mesmo módulo do Intellij IDEA, projeto do Maven, Ant task, etc.

## Hierarquia de classes e subclasses

### Herança é um dos três pilares da orientação a objetos. É através desse recurso que podemos estender ou modificar o comportamento de um código existente, promovendo a reutilização. Nesse processo a classe existente é chamada de superclasse e a classe a ser criada se chama classe derivada ou subclasse. Uma subclasse herda todos os membros presentes na superclasse por padrão.

### A herança pode ocorrer em forma de generalização e especificação. Quando um conjunto de classes, geralmente concretas, exigem uma superclasse, dizemos que as características que elas compartilham serão combinadas em uma superclasse generalizada. Considerando as classes hamburger e pizza, ambas produtos do cardápio de uma lanchonete, pensar que elas se generalizam na superclasse Food é logicamente plausível. De outra forma, pensar que Food se especializa em toppings, um tipo de alimento que geralmente acompanha um outro alimento, é natural. Apresentar como utilizar esses mecanismos em Kotlin é o objeto deste artigo.
## Herança

### Toda classe em Kotlin possui um supertipo chamado Any, que possui apenas um pequeno número de funções, as quais são equals(), hashCode() e toString(). Dessa forma, ambas as declarações abaixo são sintaticamente equivalentes:
```kt

class Food(val price: Double)

class Food(val price: Double) : Any()
```

### Para declarar um supertipo explicitamente devemos colocá-lo no cabeçalho da classe após dois pontos. Por padrão, classes em Kotlin são final, se nenhum outro modificador for utilizado em sua declaração. Isso impede que qualquer classes seja usada como supertipo de uma outra classe. Assim sendo, é necessário que a superclasse utilize o modificador open como primeiro passo para que uma outra classe herde da mesma.
```kt

open class Food(val price: Double)

class Hamburger(price: Double) : Food(price)
```

### Kotlin não suporta herança múltipla, motivo pelo qual apenas uma classe pode ser incluída na lista de supertipos de uma outra classe.

### Observe que no construtor primário da classe Hamburger não utilizamos a palavra reservada val antes do parâmetro price, o que fará com que a propriedade price em Food não seja sobrescrita. De fato, com essa sintaxe apenas recebemos um parâmetro no construtor primário de Hamburger e delegamos para o construtor primário de Food.

### Note que embora a propriedade price seja final em Food, ela pode ser acessada através de uma instância de Hamburger, dessa forma:
```kt

val hamburger: Hamburger = Hamburger(2.89)

println("Total: ${hamburger.price}")
```

### Esse é o comportamento natural para o modificador final. Caso seja necessário impedir que subclasses de Food acessem uma propriedade de uma superclasse, será preciso declará-la com um outro nível de acesso, usando os modificadores protected ou private.
## Construtores secundários

### Na ocasião da superclasse não declarar um construtor primário, cada um dos seus construtores secundários deve ser inicializado pela subclasse utilizando a palavra-chave super em lugar de this, assim como demonstrado abaixo.
```kt
open class Food {
    open val price: Double

    constructor(price: Double) {
        this.price = price
    }
}

class Hamburger : Food {
    constructor(price: Double) : super(price)
}
```

### A seguir, analisamos um novo exemplo, o qual evidencia o fato de uma subclasse poder referenciar quaisquer construtores secundários da superclasse.
``` kt

open class Food {
    open var price: Double = 0.0
    open var name: String = ""

    constructor(price: Double) {
        this.price = price
    }

    constructor(price: Double, name: String) {
        this.price = price
        this.name = name
    }
}

class Hamburger : Food {
    constructor(price: Double) : super(price)

    constructor(price: Double, name: String) : super(price, name)
}
```

### Dessa vez, na listagem de supertipos da classe Hamburger usamos a sintaxe Food em lugar de Food(), porque nesse contexto Food não possui um construtor primário.
## Propriedades

### É possível sobrescrever uma propriedade da superclasse na subclasse utilizando a palavra reservada override. Contudo, assim como as classes, propriedades em Kotlin também são final por definição e não podem ser sobrescritas ou herdadas sem a substituição explícita do modificador final por open. Vemos um exemplo disso no código abaixo.
```kt

open class Food(open val price: Double)

class Hamburger(override val price: Double) : Food(price)
```
### Mesmo sobrescrevendo a propriedade price na subclasse é necessário delegar ao construtor da superclasse.

### Uma subclasse pode incluir em seu construtor primário suas próprias propriedades. Considere que além de Hamburger a aplicação também contenha outros subtipos de Food, os quais seguem a sua própria cadeia de especificação, a fim de implementar um sistema de pedido no qual o cliente possa escolher adicionar para a sua comida. Poderíamos modelar a classe Topping da seguinte forma:
```kt

open class Topping(price: Double, private val food: Food) : Food(price) {

    override val price: Double = price
        get() = field + food.price
}
```

#### A classe Topping, além de ser uma especificação de Food, também recebe um objeto do tipo Food como parâmetro em seu construtor. Uma vez que não desejamos sobrescrever a propriedade price, tratamos de receber um parâmetro no construtor, cujo valor é transferido para a propriedade através de delegação. Contudo, food é uma propriedade que existe apenas na subclasse e, por esse motivo, usamos o modificador private e a palavra reservada val para criar essa propriedade.

### Apesar de a propriedade price não ser sobrescrita na subclasse, o seu getter é redefinido para retornar a instância de price no próprio objeto somada àquela presente na propriedade food.

### Na linguagem Kotlin, o conceito de propriedade torna desnecessário escrever getters e setters, pois implicitamente os dados de um objeto são encapsulados através de métodos acessores implícitos. Contudo, se desejarmos sobrescrever o comportamento padrão de um método de acesso podemos usar essa sintaxe:
```kt

var <propriedade>[: <tipo>] [= <valor>]
    [<getter>]
    [<setter>]
```

### Assim como Food, uma vez que Topping também é modificada com open, ela também pode ser utilizada como um supertipo. A título de exemplo, vamos declarar os subtipos Jalapeno e Mushroom, ambos derivados de Topping.
```kt

class Jalapeno(price: Double, food: Food) : Topping(price, food)

class Mushroom(price: Double, food: Food) : Topping(price, food)
```
### Feito isso, podemos instanciar um objeto a partir da composição de toppings e foods, usando até mesmo o supertipo como tipo para o objeto criado, tal qual apresentado a seguir.
```kt
val food: Food = Mushroom(
    .10,
    Jalapeno(
        .15,
        Jalapeno(
            .15,
            Hamburger(2.99)
        )
    )
)
```
### Em tempo de execução, o compilador saberá qual implementação da propriedade price invocar em uma relação de herança. Dessa forma, podemos passar uma instância de Hamburger em lugar de um Food, em primeiro lugar porque Hamburger é um Food. Num segundo momento, ocorrerá um processo chamado late binding, no qual a JVM saberá que tipo do objeto é Hamburger, executando assim a versão sobrecarregada da propriedade price desse objeto.

### Assim, ao executar a linha abaixo, o valor apresentado no terminal será a soma de todas propriedades price:
```kt
println("Total: ${food.price}") // Total: 3.39
```
## Acessando uma implementação da superclasse

### A palavra reservada super pode ser utilizada também para acessar funções da superclasse. No exemplo abaixo, usamos esse recurso para oferecer na subclasse uma função que calcula o valor de um alimento, considerando tanto uma taxa quanto um desconto.
```kt
open class Food(open val price: Double) {

    open fun calculate(fee: Double): Double {
        return price * fee
    }
}

class Hamburger(override val price: Double) : Food(price) {

    fun calculate(fee: Double, discount: Double): Double {
        return super.calculate(fee) - discount
    }
}
```
## É importante notar que a função calculate(fee: Double, discount: Double) existe apenas na subclasse. Sendo assim, caso haja uma tentativa de invocá-lo a partir de uma instância de Food um erro será emitido pelo compilador com a seguinte mensagem.
```kt
val food: Food = Mushroom(
    .10,
    Jalapeno(
        .15,
        Jalapeno(
            .15,
            Hamburger(2.99)
        )
    )
)

println("Total: ${food.calculate(1.2, 0.2)}")
```
#### *Error:(38, 43) Kotlin: Too many arguments for public open fun calculate(fee: Double): Double defined in Food*

## Classes abstratas e interfaces

### Uma classe abstrata, assim como os seus métodos abstratos, é open por padrão. Ao herdar de uma classe abstrata, todos os métodos abstratos da superclasse devem ser implementados na subclasse, a não ser que a mesma também seja abstrata. Caso contrário, um erro será emitido pelo compilador:
```kt
abstract class Food(open val price: Double) {

    abstract fun calculate(fee: Double): Double
}

class Hamburger(price: Double) : Food(price)
```
#### *Class 'Hamburger' is not abstract and does not implement abstract base class member public abstract fun calculate(fee: Double): Double defined in Food*


### Em Kotlin também é possível que uma classe abstrata herde de uma classe não abstrata. Quando isso for necessário, os métodos da superclasse não abstratos devem utilizar o modificador open.

### Ainda que isso seja incomum, há casos em que uma classe herda de uma outra que compartilha um membro com alguma interface, implementada pela subclasse. Quando isso acontecer, podemos usar uma forma qualificada de super para acessar a implementação da superclasse. Vejamos um exemplo que deixará isso mais claro:
```kt
open class Food {
    open fun calculate() { /* Alguma implementação aqui */ }
}

interface Calculable {
    fun calculate() { /* Alguma implementação aqui */ }
}

class Hamburger : Food(), Calculable {
    override fun calculate() {
      super<Food>.calculate()
      super<Calculable>.calculate()
    }
}
```
### Via de regra, sempre que uma classe herdar membros de mesmo nome de supertipos diferentes, ela mesma deve fornecer uma implementação para esse membro. No exemplo acima, a classe Hamburger fornece uma implementação para calculate, a qual invoca calculate() de Food e Calculable a partir de super qualificado.
## COLLECTION
### • Uma  coleção  é  uma  estrutura  de  dados  que  permite armazenar vários objetos.
### As  operações  que  podem  ser  feitas  em  coleções variam mas normalmente incluem:
#### • Adição de elementos;
#### • Remoção de elementos;
#### • Acesso aos elementos;
#### • Pesquisa de elementos;
### Existem vários tipode de collections iremos trabalhar agora com array.
## *Array*
Arrays são geralmente descritas como "lista de objetos"; elas são basicamente objetos que contem múltiplos valores armazenados em uma lista. Um objeto array pode ser armazenado em variáveis e ser tratado de forma muito similar a qualquer outro tipo de valor, a diferença está em podermos acessar cada valor dentro da lista individualmente, e fazer super úteis e eficientes coisas com a lista, como laço através da lista e fazer a mesma coisa para cada valor. Talvez nós pegamos uma série de produtos e seus preços armazenados em uma array, e nós queremos fazer um laço através de todos eles e mostrar em um recibo, enquanto somamos todos os preços e mostramos o preço total ao final.
### Iniciando um array
```kt
fun main(){
    val values = IntArray(size 5)

    values[0]= 1
    values[1]= 3
    values[2]= 2
    values[3]= 6
    values[4]= 5

    values.forEach{ it:Int
        println(it)
    }

}
```
### Iniciando um array de string
```kt
fun main(){
    val nomes = Array<String>(size 3){""}
            ou
    val nomes = Array(size 3){""} *deixando explicito que é uma string*
            ou
    val nomes = arrayOf("Maria","Fermino","Papagaio")

    nomes[0] = "Maria"
    nomes[1] = "Fermino"
    nomes[2] = "Papagaio"

    nomes.forEach{ it:String
        println(it)
    }
}
```
### Iniciando um Double Array
```kt
 val valores = DoubleArray(3)
    valores[0]=1233.54
    valores[1]=1200.78
    valores[2]=1500.80
    // OU
val valores2 = doubleArrayOf(1500.0, 1340.2, 3343.43)

valores.forEachIndexed{ index, valor ->
        valores[index] = valor*1.1
    }
valores.forEach{
        println(it)
    }
```
 ## XML
   
   * O XML (eXtensible Markup Language) é uma maneira de organizar textos e é composto por tags, elementos e atributos.
    
   * Use o XML para definir o layout de um app Android.
    
   * Use a classe EditText para permitir que o usuário insira ou edite texto.
    
   * Uma EditText pode ter uma dica para informar ao usuário o que é esperado nesse campo.
    
   * Especifique o atributo android:inputType para limitar o tipo de texto que o usuário pode inserir em um campo EditText.
    
   * Crie uma lista de opções exclusivas com RadioButtons, agrupadas em um RadioGroup.
    
   * Um RadioGroup pode ser vertical ou horizontal, e você pode especificar qual RadioButton será selecionado inicialmente.
    
   * Use um Switch para permitir que o usuário alterne entre duas opções.
    
   * É possível adicionar um rótulo a um Switch sem usar uma TextView separada.
    
   * Cada filho de um ConstraintLayout precisa ter restrições verticais e horizontais.
    
   * Use as restrições de "início" e "término" para lidar com os idiomas com leitura da esquerda para a direita (LTR) e da direita para a esquerda (RTL).
    
   * Os nomes dos atributos de restrição seguem o formato layout_constraint<Source>_to<Target>Of.
    
   * Para definir uma View com a largura máxima do ConstraintLayout, restrinja o início e o final dela como o início e o fim do elemento pai e defina a largura como 0 dp.
#### EXEMPLO
```kt
<ConstraintLayout>
    <TextView
        text="Hello World!">
    </TextView>
</ConstraintLayout>
```
## DICAS
* layout_width = Largura
* wrap_content = restringe de acordo com o conteúdo
* padding = é a modificação do content layout do interior para fora
* edit_text = função para os usuário inserirem conteudos
* app:layout_constraintTop_toBottomOf="@id/cost_of_service" = chama a configuração de outra classe
* android:orientation="vertical" = o grupo de botões sera em forma de coluna "vertical" ou um do lado do outro "horizontal"
* android:checkedButton como @id/option_twenty_percent = defice um padrão de qual caixa estará selecionado quando o app iniciar
* Switch =  é um botão para sim ou não
* Não é possível usar match_parent para nenhuma visualização do ConstraintLayout. Em vez disso, use 0dp, o que significa que as restrições serão igualadas.
* android:checked =defice um padrão de qual lado estará acionado quando o app iniciar.true (ativado) ou false (desativado).
* app:layout_constraintEnd_toEndOf = " " = Utiliza uma referencia para colocar o objeto no final horizontal da tela.


