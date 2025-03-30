package e_029;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        String letra, verificador=null;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma Letra: ");
        letra = leia.next();
        letra = letra.toUpperCase();
        if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            verificador = "Vogal";
        }
        else{
            verificador = "Consoante";
        }
        System.out.println("A letra " + letra + " é uma " + verificador);
        leia.close();
    }
}
