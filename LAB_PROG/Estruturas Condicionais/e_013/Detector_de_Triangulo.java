package  e_013;
import java.util.Scanner;
    public class Detector_de_Triangulo{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insira o lado 1:");
            int a = scanner.nextInt();
            System.out.print("Insira o lado 2:");
            int b = scanner.nextInt();
            System.out.print("Insira o lado 3:");
            int c = scanner.nextInt();
            if (a + b > c && b + c > a && c + a > b){  //Verificação dos lados
                System.out.println("A soma dos lados forma um triangulo!");
                if (a == b && a == c){
                    System.out.print("E é um Equilatero!");
                }
                else if(a == b || b == c || a == c ){
                    System.out.print("E é um Isósceles!");
            }
                else{
                    System.out.print("E é um Escaleno!");
                }
            
        }
            else{
                System.out.print("Isso não é um triangulo :(");
            }
            
    }
}