package e_009;

import java.util.Scanner;

public class Tá_Crescido_ou_Não{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        String msg;
        int idade, diferença;
        System.out.printf("Insira a sua idade: ");
        idade = leia.nextInt();
        diferença = 18 - idade;

        if (idade >= 18){
            msg = "VOCE É MAIOR DE IDADE";
        }
        else{
            msg = "VOCE É MENOR DE IDADE AINDA FALTAM "+ diferença + " ANOS PARA SER MAIOR";
        }

        System.out.print(msg);
    }
}