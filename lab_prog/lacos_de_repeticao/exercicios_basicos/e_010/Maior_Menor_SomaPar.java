package lab_prog.lacos_de_repeticao.exercicios_basicos.e_010;

import java.util.Scanner;

public class Maior_Menor_SomaPar {
    public static void main(String[] args) {
        int ciclo, soma_par=0, maior=0, menor=0, entrada, verif_par;
        Scanner leia = new Scanner(System.in);

        for(ciclo = 0; ciclo < 10; ciclo++){
            System.out.print("Numero " + (ciclo+1) + ": ");
            entrada = leia.nextInt();
            verif_par = entrada % 2;
            if (entrada > maior) {
                maior = entrada;
            }
            else{
                menor = entrada;
            }
            if (verif_par == 0) {
                soma_par += entrada;
            }
        }
        System.out.println("\nO maior: " + maior + "\nMenor: " + menor + "\nSoma dos Par: " + soma_par + "\n");
    }
}
