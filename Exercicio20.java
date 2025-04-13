import java.util.Scanner;

public class Exercicio20 {
    public void executar20(Scanner input) {
        System.out.println("Iniciando a execução do programa 20 -- Fibonacci");
        System.out.print("Digite quantos números da sequência de Fibonacci deseja exibir: ");
        int n = input.nextInt(),primeiro = 0, segundo = 1;
        System.out.println("Sequência de Fibonacci com " + n + " termos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
