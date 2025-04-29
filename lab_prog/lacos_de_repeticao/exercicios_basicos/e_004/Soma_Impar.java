package lab_prog.lacos_de_repeticao.exercicios_basicos.e_004;

import java.util.Scanner;

public class Soma_Impar {
    public static void main(String[] args) {
		int impar, sequencia, soma=0, verif;
		Scanner leia = new Scanner(System.in);
		
		for (sequencia = 0; sequencia < 10 ; sequencia++ ){
	    System.out.print("Num: ");
		impar = leia.nextInt();
		verif = impar % 2;
		
		if ( verif == 1){
		    soma += impar;
		}
		}
		System.out.print("A soma dos impar é " + soma);
	}
}
