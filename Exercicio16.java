import java.util.Scanner;

public class Exercicio16 {
    public void executar16(Scanner input) {
        System.out.println("Iniciando a execução do programa 16 -- média de 20 pessoas e sexo");
        int countF=0,mediaF=0,countM=0,mediaM=0,idade;
        String sexo;
        System.out.println("Digite o sexo e a idade das vinte pessoas a seguir. Para o sexo digite apenas a inicial.");
        
        for (int i =0;i<20;i++ ){
            System.out.println("Sexo: ");
            sexo = input.next().toUpperCase();
            if (sexo=="F"){
                System.out.println("Idade: ");
                idade= input.nextInt();
                mediaF+=idade;
                countF+=1;
            }else 
                System.out.println("Idade: ");
                idade= input.nextInt();
                mediaM+=idade;
                countM+=1;
            }
            System.out.println("A media de idade entre as mulheres é de "+(mediaF/countF));
            System.out.println("A media de idade entre os homens é de "+(mediaM/countM));
        }
}

