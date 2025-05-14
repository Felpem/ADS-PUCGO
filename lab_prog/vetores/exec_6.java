package lab_prog.vetores;

import java.util.Scanner;

public class exec_6 {
    public static void main(String[] args) {
        int[] primSequen = new int[10];
        int cont = 0;
        int[] sequenciaSemRepetido = new int[cont];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            primSequen[i] = sc.nextInt();
            if (primSequen[i] != primSequen[i]){
                cont++;
                sequenciaSemRepetido[i] = primSequen[i];
            }
        }
        for (int i = 0; i < cont; i++ ){
            System.out.println(sequenciaSemRepetido[i] + ", ");
        }


    }
}
