import java.util.Scanner;



public class Exercicio6 {
    public void executar6(Scanner input){
        System.out.println("Iniciando a execução do programa 6 -- cumprimento");
        System.out.println("Em que turno você estuda?\nDigite M-matutino ou " + //
                        "V-Vespertino ou N- Noturno");
        String turno = input.next().toUpperCase();
        if (turno =="M"){
            System.out.println("Bom dia!");
        }else if (turno == "V") {
            System.out.println("Boa tarde!");            
        }else if (turno =="N"){
            System.out.println("Boa noite!");
        }else{System.out.println("Entrada inválida!");}
    }
}

