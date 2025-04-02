package lab_prog.lacos_de_repeticao.e_007;

import java.util.Scanner;

public class Quantos_Digit {
    public static void main(String[] args) {
        int digitado=0, entrada=0;
        Scanner leia = new Scanner(System.in);

        while (entrada != -1) {
            System.out.print("Digite um numero: ");
            entrada = leia.nextInt();
            if(entrada != -1){
                digitado += 1;
            }
        }
        System.out.println(digitado + " numeros foram digitados");
    }

}
