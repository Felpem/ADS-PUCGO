package e_017;

import java.util.Scanner;

public class Feira_das_Frutas {
    public static void main(String[] args) {
       double kg, fruta, custo = 0; 
       Scanner leia = new Scanner(System.in);
       System.out.println("[1] Carambola\n[2] Amora\n[3] Figo Roxo\n[4] Kiwi");
       System.out.print("Qual Fruta deseja: ");
       fruta = leia.nextDouble();
       System.out.print("Quantos KG: ");
       kg = leia.nextDouble();
    
            if (fruta == 1){
                if (kg > 10) {
                    custo = kg * 7.54;
                }
                else{ custo = kg * 10.08; }
        }
            else if (fruta == 2) {
                if (kg > 10) {
                    custo = kg * 32;
                }
                else{ custo = kg * 34.8; }
            
        }
            else if (fruta == 3) {
                if (kg > 10) {
                    custo = kg * 6.67;
                }
                else{ custo = kg * 7.66; }
        }
            else if (fruta == 4) {
                if (kg > 10) {
                    custo = kg * 12.4;
                }
                else{ custo = kg * 14.83; }
        }
        else{
        System.out.println("INVALIDO");
       }
            if (kg >= 15 || custo >= 200){
                custo = custo - (custo * 0.2);
        }

        System.out.print("O preço das frutas ficou " + custo);

        }
    }


