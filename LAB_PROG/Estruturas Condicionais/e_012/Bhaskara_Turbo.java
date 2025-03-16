package e_012;
import java.util.Scanner;
public class Bhaskara_Turbo {
    public static void main(String[] args) {
        double a, b , c , delta, x1 = 0, x2 = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Coeficiente A: ");
        a = leia.nextDouble();
        System.out.print("Coeficiente B: ");
        b = leia.nextDouble();
        System.out.print("Coeficiente C: ");
        c = leia.nextDouble();

        if (a == 0){
            System.out.print("Não forma equac 2°");
        }
        else{
            delta = Math.pow(b, 2) - 4 * a * c;
            x1 = ((-b) + Math.sqrt(delta))/(2*a);
            x2 = ((-b) - Math.sqrt(delta))/(2*a);
            if (delta < 0) {
                System.out.print("Delta negativo, não faz equac 2°");
            }
            else if (delta == 0){
                x2 = x1;
                x1 = x2;
            }
        }
        System.out.printf("O valor de X1 é: " + x1 + "\n\nO valor de X2 é : " + x2);
    }
}
