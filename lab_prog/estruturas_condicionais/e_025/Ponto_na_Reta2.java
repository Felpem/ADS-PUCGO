package lab_prog.estruturas_condicionais.e_025;
import java.util.Scanner;
    public class Ponto_na_Reta2{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            double x, y, a, b;
            System.out.print("Primeiro Ponto: ");
            x = sc.nextDouble();
            System.out.print("Segundo Ponto: ");
            y = sc.nextDouble();
            System.out.print("Coeficiente A: ");
            a = sc.nextDouble();
            System.out.print("Coeficiente B: ");
            b = sc.nextDouble();
            if (a * x + y == b){
                System.out.print("O ponto está na reta");
            }
            else{
                System.out.print("O ponto não está na reta");
            }
        }
    }