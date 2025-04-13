import java.util.Scanner;

public class Exercicio3 {
    
    public void executar3(Scanner input) {
        System.out.println("Iniciando a execução do programa 3 -- par ao quadrado, ímpar ao cubo");
        System.out.println("Informe o valor da variável: ");
        int num = input.nextInt();
        if (num %2 ==0){
            System.out.println("O número informado é par e seu quadrado é "+ Math.pow(num, 2) );
        }else if(num %2 ==1){
            System.out.println("O número informado é ímpar e seu cubo é "+Math.pow(num,3));
        }else{System.out.println("Número inválido.");}
    }
}