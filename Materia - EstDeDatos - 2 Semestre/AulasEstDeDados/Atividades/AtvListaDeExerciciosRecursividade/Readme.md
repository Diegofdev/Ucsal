**

# Lista de exercícios utilizando recursividade.

**

 **- 1 – O método a seguir, executa o cálculo do MDC (máximo divisor comum) de
dois inteiros positivos m e n. Escreva um método recursivo equivalente.**

    public static int CalculaMDC(int m, int n) {
	int r;
	do{
    r = m%n;
    m = n;
    n = r;
    } while (r != 0);
    return m;
    }

 **- 2 - Desenvolva um programa em java que calcule o fatorial de um
   número x.**

 **- 3 – Escreva em java um método recursivo que receba um número inteiro
   na base decimal e realize a conversão deste número para base binária.**

 **- 4 - Faça um programa em java fazendo uso da recursividade que
   solicite para o usuário digitar um número, em seguida, faça a soma de
   todos os algarismos do número. Exemplos:**
 

      1981 = 1 + 9 + 8 + 1
      2020 = 2 + 0 + 2 + 0
