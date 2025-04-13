import java.util.Scanner;

public class Exercicio13 {
    public void executar13(Scanner input) {
        System.out.println("Iniciando a execução do programa 13 -- tabuada");
        System.out.println("Digite o número que deseja saber a tabuada");
        int base= input.nextInt();
        if (base<10 && base >0){
            System.out.println("Tabuada do "+base);
            for (int i =1; i<11;i++){
                System.out.println(base + " X "+ i + " = "+ base*i);
            }
        }
        else{
            for (int k =1; k<11;k++){
                System.out.println("Tabuada do "+k);
                for (int j =1; j<11;j++){
                    System.out.println(k + " X "+ j + " = "+ k*j);
                }
            }
        }
    
    }   
}   

