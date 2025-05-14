package lab_prog.vetores;
import java.util.Scanner;
public class exec_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetor_soma = new int[10];
        int soma_total = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um valor: ");
            vetor_soma[i] = sc.nextInt();
            soma_total = soma_total + vetor_soma[i];
        }
        System.out.println("A soma dos valores no vetor: " + soma_total);
    }
}
