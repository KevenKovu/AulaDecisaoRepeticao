import java.util.Scanner;

public class Exercicio5 {
    public void executar5(Scanner input){
        System.out.println("Iniciando a execução do programa 5 -- par divisível, ímpar divisível");
        System.out.println("Informe o valor da variável: ");
        int num = input.nextInt();
        if (num %2 ==0){
            System.out.println("O numero é par.");
            if (num%3==0) {
                System.out.println("E divisível por 3.");
            }
        }else if(num %2 ==1){
            System.out.println("O número é ímpar.");
            if (num%5==0){
                System.out.println("E divisível por 5.");
            }
        }else{System.out.println("Número inválido.");}
    }
}
