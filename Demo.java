import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int opt; // Escolhe a atividade
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu de exercícios");
            System.out.println("\t0 - Menu com do-while");
            System.out.println("\t2 - Exercício ....");
            System.out.println("\t3 - Exercício ....");
            System.out.println("\t-1 - SAIR DO PROGRAMA!");

            System.out.println("Escolha sua opção: ");
            opt = input.nextInt();

            switch (opt) {
                
                case 1:
                    System.out.println("Iniciando a execução do exercício 1...\n");
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.executar();
                    break;
                case 2:
                    Exercicio2 exercicio2 = new Exercicio2();
                    exercicio2.executarExercicio2(input);
                    break;
                case 3:
                    Exercicio3 exercicio3 = new Exercicio3();
                    exercicio3.executar3(input);
                    break;
                case 4:
                    Exercicio4 exercicio4 = new Exercicio4();
                    exercicio4.executar4(input);
                    break;
                case 4:
                    Exercicio5 exercicio5 = new Exercicio5();
                    exercicio5.executar5(input);
                    break
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
