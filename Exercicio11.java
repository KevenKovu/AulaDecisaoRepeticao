import java.util.Scanner;

public class Exercicio11 {
    public void executar11(Scanner input) {
        System.out.println("Iniciando a execução do programa 11 -- media de 5 números e para se digita 0.");
        int num,media=0;
        
        System.out.println("Dê 5 valores, sendo um por vez.");
        do{
            num = input.nextInt();
            teste0(num);
            if (num%2==0){
                media+=num;
                num = input.nextInt();
                teste0(num);
            }if (num%2==0){
                media+=num;
                num = input.nextInt();
                teste0(num);
            }if (num%2==0){
                media+=num;
                num = input.nextInt();
                teste0(num);
            }if (num%2==0){
                media+=num;
                num = input.nextInt();
                teste0(num);
            }if (num%2==0){
                media+=num;
                media/=5;
                System.out.println("A média é "+media);
            }else{System.out.println("Algum número não é par.");}

        }while (media==0);
    
    }
    public void teste0(int num){
        if (num==0){
            System.exit(0);
        }
    }
    
}
 