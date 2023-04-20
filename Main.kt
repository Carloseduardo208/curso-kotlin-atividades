fun main() {

    val a = 1
    while (a == 1) {
        print(
            "\n Bem vindo ao sistema Kotlin, o que deseja?" +
                    "\n 1 - Saber a Diferença entre Kotlin e Java" +
                    "\n 2 - Saber a Diferença entre Variavel e constante" +
                    "\n 5 - Entrada, Processamento e saida" +
                    "\n 7 - Questões praticas sobre if e else" +
                    "\n 8 - Questões prticas sobre when" +
                    "\n 9 - Desafio semanal" +
                    "\n 10 - Encerrar programa " +
                    "\n Digite o número correspondente ao desejado: "
            //OBS.: as opções 3,4 e 6 não possuem nada para ser impresso na tela, logo o menu logo acima não funciona nestas opções.
        )
        val numero = readln().toInt()

        when (numero) {


            1 -> {
                print("\n  Olá! Quer saber as diferenças existentes entre kotlin e java?\n  1 - SIM\n  2 - NÃO\n  Digite o número correspondente ao desejado: ")
                val num = readln().toInt()

                if (num == 1) {
                    println("\n------- DIFERENÇAS ENTRE AS LINGUAGENS KOTLIN E JAVA ------")
                    println("\n  Ambas as linguagens são muito utilizadas devido sua capacidade de serem implementadas em ambientes Web e Mobile. Para ficar por dentro das diferenças e semelhanças, a seguir você vai conferir algumas delas!")
                    println("  O Kotlin se baseia nas linguagens de programação mais atuais, oferecendo a opção de trabalhar com parâmetros com valor padrão. Desse modo, pode-se determinar um valor em situações em que a pessoa que chama o método não tenha fornecido essa informação. Já no Java, esse processo é realizado com sobrescrita de métodos no próprio corpo do método.")
                    println("  A linguagem Java conta com o operador ternário, no qual o programador pode atribuir uma variável de acordo com o resultado obtido em uma operação condicional. Essa função foi aprimorada no Kotlin, tendo em vista que os blocos condicionais if e when fazem o retorno de um valor especificamente para a variável. O seu benefício está na capacidade de executar blocos inteiros de código e, no fim da operação, ainda retornar o valor.")
                    println("  Um dos recursos mais populares do Kotlin são as data classes, que acabam eliminando a necessidade de uso do boilerplate dos incontáveis getters e setters presentes nas classes de negócios típicos do Java. Nesse sentido, o Kotlin segue o conceito de propriedade, enquanto que o Java atua a partir de atributos.")
                    println("  Pode-se dizer que essa diferença é conceitual, pois no Java os atributos são privados e o desenvolvedor precisa aplicar os métodos getters e setters para conseguir acessá-los. No Kotlin, esse acesso ocorre pela instância da classe, bastando aplicar o operador ponto final. Somente quando for estritamente necessário utilizar uma regra de negócio é que o programador poderá recorrer ao getter ou setter.")
                    println("  Por fim, vale destacar que o Kotlin não é ideal para favorecer a herança. Nessa linguagem, diferentemente do que costuma acontecer no Java, para que uma classe seja herdada é preciso que esta use o operador open durante a sua declaração. Se esse processo não for efetuado, certamente o desenvolvedor vai se deparar com um erro de compilação.")

                } else {
                    println("\n Sessão Encerrada")
                }
                Thread.sleep(5000L)
            }
            2 -> {
                //Passo 1
                var v: Int = 10
                println("Váriavel: $v")

                //Passo 2
                val c = 5
                println("Constante: $c")

                //Passo 3
                println("Uma variável é um item de dados nomeado cujo valor pode ser alterado durante a execução do programa, enquanto que uma constante é um item de dados nomeado com um valor predefinido.")

                Thread.sleep(5000L)
            }
            3 -> {
                /* Letra A - Números decimais podem ser do tipo Float ou Doable, dependendo da quantidade de casas. */
                val v: Float = 12.99f

                /* Letra B */
                val texto: String = "sua vida de amanha será o resultado do que vc fizer hj."
                val num: Int = 10

                /* Letra C - Um número inteiro pode ser do tipo Int, Byte, Short ou Long, já os decimais podem ser do tipo Float ou Doable, dependendo da quantdade de casas. */
                val numInt: Int = 1
                val numDec: Float = 16.25f

            }
            4 -> {
                //Letra A
                val num1: Int = 2
                val num2: Int = 3
                val soma = num1 + num2

                //Letra B
                val resultado1 = (5 > 3 && 2 < 4)
                //Será exibido: true.

                //Letra C
                val resultado2 = (!(10 > 5 || 3 < 1))
                //Será exibido: false.



            }
            5 -> {
                //Questão 1:
                println("\nDigite um número:")
                val num1 = readln().toInt()
                println("Digite + um número:")
                val num2 = readln().toInt()
                val soma = num1 + num2
                print("Resultado: $soma")

                //Questão 2:
                println("\nDigite um número:")
                val num3 = readln().toInt()
                print("Quadrado do número: " + (num3 * num3))

                //Questão 3:
                println("\nDigite seu nome:")
                val nome = readLine()
                println("Digite sua idade:")
                val idade = readln().toInt()
                println("Boas-vindas $nome!\nIdade: $idade anos.")
                Thread.sleep(3000L)

            }
            6 -> {
                // com esse tipo de comentario, só dá pra comentar uma linha por vez.

                /* com esse tipo de comentario podemos comentar qualquer quantidade de linhas, basta apenas abrir pra começar e fechar quando concluir seu comentário. */

            }
            7 -> {
                //Questão 1:
                println("\nDigite sua primeira nota: ")
                val nota1 = readln().toFloat()
                println("Digite sua segunda nota: ")
                val nota2 = readln().toFloat()

                val media = (nota1 + nota2) / 2

                if (media >= 7) {
                    println("Aprovado!")
                } else {
                    println("Reprovado.")
                }

                //Questão 2:
                println("\nDigite um número: ")
                val num1 = readln().toInt()

                if (num1 % 2 == 0) {
                    println("Par!")
                } else {
                    println("Ímpar!")
                }

                //Questão 3:
                println("\nDigite um número: ")
                val num2 = readln().toInt()

                if (num2 < 0) {
                    println("Negativo!")
                } else {
                    println("Positivo!")
                }

                //Questão 4:
                println("\nDigite sua idade: ")
                val idade = readln().toInt()

                if (idade >= 18) {
                    println("Você é maior de idade!")
                } else {
                    println("Você é menor de idade!")
                }
                Thread.sleep(3000L)

            }
            8 -> {
                //Questão 1:
                println("\nDigite um número: ")
                val num1 = readln().toInt()

                when (num1) {
                    1 -> {
                        println("Domingo")
                    }

                    2 -> {
                        println("Segunda")
                    }

                    3 -> {
                        println("Terça")
                    }

                    4 -> {
                        println("Quarta")
                    }

                    5 -> {
                        println("Quinta")
                    }

                    6 -> {
                        println("Sexta")
                    }

                    7 -> {
                        println("Sábado")
                    }

                    else -> {
                        println("Dia não existente.")
                    }
                }

                //Questão 2:
                println("\nO animal:\n1 - Mama\n2 - Rasteija\n3 - Possui asas\nDigite o número correspondente a característica do animal: ")
                val num2 = readln().toInt()

                when (num2) {
                    1 -> {
                        println("Mamífero")
                    }

                    2 -> {
                        println("Réptil")
                    }

                    3 -> {
                        println("Ave")
                    }

                    else -> {
                        println("Animal indefinido.")
                    }
                }

                //Questão 3:
                println("\nDigite um número: ")
                val letra = readLine()

                when (letra) {
                    "a" -> {
                        println("Vogal")
                    }

                    "e" -> {
                        println("Vogal")
                    }

                    "i" -> {
                        println("Vogal")
                    }

                    "o" -> {
                        println("Vogal")
                    }

                    "u" -> {
                        println("Vogal")
                    }

                    else -> {
                        println("Consoante")
                    }
                }

                //Questão 4:
                println("\nDigite um número: ")
                val num3 = readln().toInt()

                when (num3) {
                    1 -> {
                        println("Janeiro")
                    }

                    2 -> {
                        println("Fevereiro")
                    }

                    3 -> {
                        println("Março")
                    }

                    4 -> {
                        println("Abril")
                    }

                    5 -> {
                        println("Maio")
                    }

                    6 -> {
                        println("Junho")
                    }

                    7 -> {
                        println("Julho")
                    }

                    8 -> {
                        println("Agosto")
                    }

                    9 -> {
                        println("Setembro")
                    }

                    10 -> {
                        println("Outubro")
                    }

                    11 -> {
                        println("Novembro")
                    }

                    12 -> {
                        println("Dezembro")
                    }

                    else -> {
                        println("Mês não existente.")
                    }
                }

                Thread.sleep(3000L)
            }
            9 -> {
                var resultado: Float = 00.0f

                println("\n|------------------ MENU -------------------|")
                println("\nO QUE DESEJA CONVERTER?\n  1 - Temperatura\n  2 - Distância\n  3 - Tempo\n\nDigite o número correspondente: ")
                val conversao = readln().toInt()
                println("\n|-------------------------------------------|")

                if (conversao == 1) {
                    println("\nDigite a temperatura em Celsius:")
                    val temperatura = readln().toFloat()
                    resultado = (temperatura * 9 / 5 + 32)
                } else {
                    if (conversao == 2) {
                        println("\nDigite a distância em metros:")
                        val distancia = readln().toFloat()
                        resultado = distancia * 0.001f
                    } else {
                        if (conversao == 3) {
                            println("\nDigite o tempo em horas:")
                            val horas = readln().toFloat()
                            resultado = horas * 60
                        }
                    }
                }

                when (conversao) {
                    1 -> {
                        println("\nA conversão de temperatura teve como resultado $resultado Fahrenheit.")
                    }

                    2 -> {
                        println("\nA conversão de distância teve como resultado $resultado quilometros.")
                    }

                    3 -> {
                        println("\nA conversão de tempo teve como resultado $resultado minutos.")
                    }

                    else -> {
                        println("\nConversão impossível.")
                    }
                }

                Thread.sleep(3000L)
            }
            10 -> {
                println("programa encerrado, obrigado pela visita")
                Thread.sleep(3000L)
                break
            }
        }
    }
}