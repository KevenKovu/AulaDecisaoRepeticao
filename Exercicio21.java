import java.util.Scanner;

public class Exercicio21 {
    public void executar21(Scanner input) {
        System.out.print("Digite o valor do lado a: ");
        double ladoA = input.nextDouble();
        System.out.print("Digite o valor do lado b: ");
        double ladoB = input.nextDouble();
        System.out.print("Digite o valor do lado c: ");
        double ladoC = input.nextDouble();

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Os valores " + ladoA + ", " + ladoB + " e " + ladoC + 
                               " representam os lados de um triângulo");
        } else {
            System.out.println("Triângulo inexistente! Os valores " + ladoA + ", " + ladoB + 
                               " e " + ladoC + " não representam os lados de um triângulo");
        }
    }
}
