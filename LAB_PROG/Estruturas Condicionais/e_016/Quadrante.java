package e_016;

import java.util.Scanner;

public class Quadrante{
public static void main(String[] args) {
    double x, y;
    Scanner leia = new Scanner(System.in);
    String msg;

        System.out.print("X: ");
        x = leia.nextDouble();
        System.out.print("Y: ");
        y = leia.nextDouble();

        if (x == 0 && y > 0) {
            msg = "O ponto esta no Eixo Y";
        }
        else if (x > 0 && y == 0){
            msg = "O ponto esta no Eixo X";
        }
        else if (x > 0 && y > 0){
            msg = "O ponto esta no Primeiro Quadrante";
        }
        else if (x  < 0 && y > 0){
            msg = "O ponto está no Segundo Quadrante";
        }
        else if (x > 0 && y < 0){
            msg = "O ponto está no Terceiro Quadrante";
        }
        else if (x < 0 && y < 0 ){
            msg = "O ponto esta no Quarto Quadrante";
        }
        else{
            msg = "O ponto está no ponto de Origem";
        }
        System.out.println(msg);
    }
}