package lab_prog.estruturas_condicionais.e_026;

import java.util.Scanner;

public class Intersecçao_Retas {
    public static void main(String[] args) {
        double a1,b1,a2,b2, coord=0, coord2=0;
        String msg = null;
        Scanner leia = new Scanner(System.in);

        System.out.print("A1: ");
        a1 = leia.nextDouble();
        System.out.print("A2: ");
        a2 = leia.nextDouble();
        System.out.print("B1: ");
        b1 = leia.nextDouble();
        System.out.print("B2: ");
        b2 = leia.nextDouble();

        if (a1 == a2) {
            coord = a1;
            msg = "Há uma intersecção no Ponto A na coordenada ";
            System.out.println(msg + coord);
        }
        else if (b1 == b2) {
            coord = b1;
            msg = "Há uma intersecção no Ponto B na coordenada ";
            System.out.println(msg + coord);
        }
        else if (b1 == b2 && a1 == a2){
            coord =  a1;
            coord2 = b1;
            msg = "Há uma intersecção no Ponto A e Ponto B na coordenada ";
            System.out.println(msg + coord + " " + coord2);
        }
        else{
            System.out.println("Não há uma interseção!");
        }
        
    }
}
