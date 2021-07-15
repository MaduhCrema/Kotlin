# Informações úteis KOTLIN

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
## Hierarquia de classes e subclasses

* criar uma hierarquia de classes, que é uma árvore de classes em que as classes filhas herdam a funcionalidade das classes pai. 
     Propriedades e funções são herdadas por subclasses;

* criar uma classe abstract em que algumas funcionalidades podem ser implementados pelas subclasses. 
    Portanto, uma classe abstract não pode ser instanciada;

* criar subclasses de uma classe abstract;

* usar a palavra-chave override para modificar propriedades e funções em subclasses;

* usar a palavra-chave super para referenciar funções e propriedades na classe pai;

* criar uma classe open para que ela possa ser transformada em subclasse;

* criar uma propriedade private, para que só possa ser usada dentro da classe;

* usar a construção with para fazer várias chamadas na mesma instância do objeto;

* importar a funcionalidade da biblioteca kotlin.math. 
   
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
```
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
* app:layout_constraintEnd_toEndOf = " " = Utiliza uma referencia para colocar o objeto no final horizontal da tela


