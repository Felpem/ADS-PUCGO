package e_028;

import java.util.Scanner;

public class Numero3025 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int entrada, parte1, parte2, satisfacao; 
        String msg;

        System.out.print("Digite um Numero: ");
        entrada = leia.nextInt();
        if (entrada < 1000 || entrada > 9999){
            msg = "INVALIDO";
        }
        else{
            parte1 = entrada / 100;
            parte2 = entrada % 100;
            satisfacao = (parte1 + parte2) * (parte1 + parte2);

            if (satisfacao == entrada){
                msg = "O numero " + entrada + " satisfaz a caracteristica de 3025";
            }
            else{
                msg = "O numero " + entrada + " não satisfaz a caracteristica de 3025";
            }
            System.out.println(msg);
        }

    } 



}
