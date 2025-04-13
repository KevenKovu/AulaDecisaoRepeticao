import java.util.Scanner;

public class Exercicio4 {
    public void executar4(Scanner input){
        System.out.println("Iniciando a execução do programa 4 -- Ficha pessoal");
        System.out.println("Informe seu nome, o sexo e o estado civil, na sequência:");
        System.out.println("Tabela de receferência:\n(F)emenino ou (M)asculino\n(C)asado ou\r\n" + //
                        "(S)olteiro");
        String nome= input.next(),sexo=input.next().toUpperCase(),ES=input.next().toUpperCase();
        if (sexo.equals("F") && ES.equals("C")){
            System.out.println("Quanto tempo de casada?");
            String TempoCasada = input.next();
            System.out.println("Nome: "+nome+"\nSexo: "+sexo+"\nEstado Civil: "+ES+"\nTempo de Casada: "+TempoCasada);
        }else{System.out.println("Nome: "+nome+"\nSexo: "+sexo+"\nEstado Civil: "+ES);}

    }
}
