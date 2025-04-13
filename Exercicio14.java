import java.util.Scanner;

public class Exercicio14 {
    public void executar14(Scanner input) {
        System.out.println("Iniciando a execução do programa 14 -- piramide de '*'");
        System.out.println("Quantos '*'de altura vai querer? (Menos de 21)");
        int altura = input.nextInt();
        String piramide="";
        for (int i=0; i<altura;i++){
            piramide= piramide+"*";
            System.err.println(piramide);
        }
    }
}
