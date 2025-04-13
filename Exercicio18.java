import java.util.Scanner;

public class Exercicio18 {
    public void executar18(Scanner input) {
        System.out.println("Iniciando a execução do programa 18 -- Primos de 1 a 100");
        System.out.println("Os primos de 1  a 100 são: ");
        int count=0;
        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0)   {
                    count+=1;
                }else if (j==(i-1)&& count==1) {
                    System.out.println(i);
                }
            }
            count=0;
        
        }
    }

}
