package lab_prog.estruturas_condicionais.e_022;
import java.util.Scanner;

public class Processo_Seletivo {
    public static void main(String[] args) {
        
        double nota1, nota2, media;
        char conceito;
        Scanner leia = new Scanner(System.in);

        System.out.print("Insira a Nota 1: ");
        nota1 = leia.nextDouble();
        System.out.print("Insira a Nota 2: ");
        nota2 = leia.nextDouble();
        System.out.print("Insira a Nota 3: ");

        media = (nota1 + nota2)/2;

        if (media >= 9){
            conceito = 'A';
        }
        else if (media < 9 && media >= 7.5) {
            conceito = 'B';
        }
        else if (media < 7.5 && media >= 6) {
            conceito = 'C';
        }
        else if (media < 6 && media >= 4){
            conceito = 'D';
        }
        else{
            conceito = 'E';
        }

        System.out.println("A nota foi " + media + " com um conceito: " + conceito);
    }
}