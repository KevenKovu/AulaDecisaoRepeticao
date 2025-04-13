import java.util.Scanner;

public class Exercicio15 {
   public void executar15(Scanner input) {
        System.out.println("Iniciando a execução do programa 15 -- piramide de '*'");
        System.out.println("Iniciando a execução do programa 14 -- piramide de '*'");
        System.out.println("Quantos '*'de altura vai querer? (Menos de 21)");
        int altura;
        do{
            System.out.println("Digite o número:");
            altura=input.nextInt();

        }while(altura < 0 ||altura>20);
        

        String piramide="";
        for (int i=0; i<altura;i++){
            piramide= piramide+"*";
            System.err.println(piramide);
        }
    } 
}
