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
            System.out.println("\t4 - Exercício ....");
            System.out.println("\t5 - Exercício ....");
            System.out.println("\t6 - Exercício ....");
            System.out.println("\t7 - Exercício ....");
            System.out.println("\t8 - Exercício ....");
            System.out.println("\t9 - Exercício ....");
            System.out.println("\t10 - Exercício ....");
            System.out.println("\t11 - Exercício ....");
            System.out.println("\t12 - Exercício ....");
            System.out.println("\t13 - Exercício ....");
            System.out.println("\t14 - Exercício ....");
            System.out.println("\t15 - Exercício ....");
            System.out.println("\t16 - Exercício ....");
            System.out.println("\t17 - Exercício ....");
            System.out.println("\t18 - Exercício ....");
            System.out.println("\t19 - Exercício ....");
            System.out.println("\t20 - Exercício ....");
            System.out.println("\t21 - Exercício ....");
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
                case 5:
                    Exercicio5 exercicio5 = new Exercicio5();
                    exercicio5.executar5(input);
                    break;
                case 6:
                    Exercicio6 exercicio6 = new Exercicio6();
                    exercicio6.executar6(input);
                    break;
                case 7:
                    Exercicio7 exercicio7 = new Exercicio7();
                    exercicio7.executar7(input);
                    break;
                
                case 8:
                    Exercicio8 exercicio8 = new Exercicio8();
                    exercicio8.executar8(input);
                    break;
                
                case 9:
                    Exercicio9 exercicio9 = new Exercicio9();
                    exercicio9.executar9(input);
                    break;
                
                case 10:
                    Exercicio10 exercicio10 = new Exercicio10();
                    exercicio10.executar10(input);
                    break;
                
                case 11:
                    Exercicio11 exercicio11 = new Exercicio11();
                    exercicio11.executar11(input);
                    break;
                
                case 12:
                    Exercicio12 exercicio12 = new Exercicio12();
                    exercicio12.executar12(input);
                    break;
                
                case 13:
                    Exercicio13 exercicio13 = new Exercicio13();
                    exercicio13.executar13(input);
                    break;
                
                case 14:
                    Exercicio14 exercicio14 = new Exercicio14();
                    exercicio14.executar14(input);
                    break;
                
                case 15:
                    Exercicio15 exercicio15 = new Exercicio15();
                    exercicio15.executar15(input);
                    break;
                
                case 16:
                    Exercicio16 exercicio16 = new Exercicio16();
                    exercicio16.executar16(input);
                    break;
                
                case 17:
                    Exercicio17 exercicio17 = new Exercicio17();
                    exercicio17.executar17(input);
                    break;
                
                case 18:
                    Exercicio18 exercicio18 = new Exercicio18();
                    exercicio18.executar18(input);
                    break;
                
                case 19:
                    Exercicio19 exercicio19 = new Exercicio19();
                    exercicio19.executar19(input);
                    break;
                
                case 20:
                    Exercicio20 exercicio20 = new Exercicio20();
                    exercicio20.executar20(input);
                    break;
                
                case 21:
                    Exercicio21 exercicio21 = new Exercicio21();
                    exercicio21.executar21(input);
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
