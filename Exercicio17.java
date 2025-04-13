import java.util.Scanner;

public class Exercicio17 {
    public void executar17(Scanner input) {
        System.out.println("Iniciando a execução do programa 17 -- IMC");
        System.out.println("Me informe seu peso e altura , na sequência.");
        float peso= input.nextFloat(), altura= input.nextFloat(),IMC;
        IMC = peso/(altura*altura);
        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso adequado");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30 ) {
            System.out.println("Obesidade ");
        }
}

}
