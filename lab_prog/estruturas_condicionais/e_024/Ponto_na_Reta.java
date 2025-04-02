package lab_prog.estruturas_condicionais.e_024;
import java.util.Scanner;
    public class Ponto_na_Reta{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            double x, y;
            System.out.print("Primeiro Ponto: ");
            x = sc.nextDouble();
            System.out.print("Segundo Ponto: ");
            y = sc.nextDouble();
            if (2 * x + y == 3){
                System.out.print("O ponto está na reta");
            }
            else{
                System.out.print("O ponto não está na reta");
            }
        }
    }