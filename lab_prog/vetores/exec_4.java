package lab_prog.vetores;

import java.util.Scanner;

public class exec_4 {
    public static void main(String[] args) {
        int[] primSequen = new int[10], segunSequen = new int[10],sequenInvertida = new int[10];
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite um valor: ");
            primSequen[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.print(primSequen[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            sequenInvertida[i] = primSequen[9 - i];
        }
        for (int i = 0; i < 10; i++){
            System.out.print(sequenInvertida[i] + " ");
        }
    }
}
