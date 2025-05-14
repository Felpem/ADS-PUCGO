package lab_prog.vetores;

import java.util.Scanner;

public class exec_5 {
    public static void main(String[] args) {
        int[] sequencia = new int[10];
        int numeroEscolhido;
        int cont=0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um valor: ");
            sequencia[i] = sc.nextInt();
        }
        System.out.print("Qual numero quer verificar: ");
        numeroEscolhido = sc.nextInt();
        for(int i = 0; i < 10; i++){
        if (sequencia[i] == numeroEscolhido){
            cont++;
        }
    }
        System.out.println("O numero " + numeroEscolhido + " aparece " + cont + " vezes.");
    }
}
