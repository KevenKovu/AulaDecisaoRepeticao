import java.util.Scanner;

public class Exercicio19 {
    public void executar19(Scanner input) {
        System.out.println("Iniciando a execução do programa 19 -- fatorial");
        System.out.print("Digite um número inteiro positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        }

}

}
