package lab_prog.lacos_de_repeticao.e_006;

import java.util.Scanner;

public class Soma_999 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int entrada=0, soma = 0; 
        while (entrada != -999) {
            entrada = leia.nextInt();
            if(entrada != -999){
                soma += entrada;
            }
        }
        System.out.println(soma);

    }
}
