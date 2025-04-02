package lab_prog.estruturas_condicionais.e_008;

import java.util.Scanner;

public class Acima_Abaixo {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        double x, y, ponto;
        String msg;
        System.out.printf("Insira o valor de X: ");
        x = leia.nextDouble();
        System.out.printf("Insira o valor de Y: ");
        y = leia.nextDouble();

        ponto = (Math.pow(x,2)) - (3*x) + 1;

        if (ponto == 0){
            msg = "Ponto Pertence a Parábola";
        }   else if (ponto > 0){
                msg = "Ponto Acima da Parábola";
        }
                else{
                    msg = "Ponto Abaixo da Parábola";
                }
        System.out.print(msg);
    }
}
