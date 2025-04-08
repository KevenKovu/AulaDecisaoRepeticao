import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int opt; // Escolhe a atividade
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu de exercícios");
            System.out.println("1 - Menu com do-while");
            System.out.println("2 - Exercício ....");
            System.out.println("-1 - SAIR DO PROGRAMA!");

            System.out.println("Escolha sua opção: ");
            opt = input.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Iniciando a execução do exercício 1...\n");
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.executar();
                    break;
                case 2:
                    // Aqui entra o comando para o exercício 2...
                    break;
                case -1:
                    // Sai do programa.
                    System.out.println("Programa finalizado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }


        } while (opt != -1);
    }
}
