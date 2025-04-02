package lab_prog.estruturas_condicionais.e_023;

import java.util.Scanner;

public class XYZ_Confusao {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner leia = new Scanner(System.in);

        System.out.print("X: ");
        x = leia.nextInt();

        System.out.print("Y: ");
        y = leia.nextInt();

        if (x > y) {
            if (z < x) {
                z = y;    
            }
            else{
                z = x;
            }
        }
        if (y == x) {
            y = z;
        
        }
        else{
            y = y - z;
        }

        System.out.println(x + " "+ y + " " + z);

    }
}
