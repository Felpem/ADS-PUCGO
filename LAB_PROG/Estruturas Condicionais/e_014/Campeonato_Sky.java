package e_014;

import java.util.Scanner;

public class Campeonato_Sky {
    public static void main(String[] args) {
        double peso, altura;
        String categoria;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Digite a sua altura(cm): ");
        altura = leia.nextDouble();

        if (peso >= 50 && peso < 60 && altura < 170){
            categoria = "Novato";
        }
        else if (peso >= 60 && peso <= 80 && altura >= 170 && altura <= 190) {
            categoria = "Profissional";
        }
        else{
            categoria = "Amador";
        }

        System.out.printf(categoria);
    }
}
