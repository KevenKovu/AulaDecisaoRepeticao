import java.util.Scanner;

public class Exercicio10 {
    public void executar10(Scanner input) {
        System.out.println("Iniciando a execução do programa 10 -- cout negativos");
        int count= 0;
        float num;
        System.out.println("Dê 5 valores, sendo um por vez.");
        for (int i=0; i>5;i++){
            num=input.nextFloat();
            if (num<0){
                count= count+1;
            }
        }
        System.out.println("Você deu essa quantidade de números negativos: " +count);
    }
}
