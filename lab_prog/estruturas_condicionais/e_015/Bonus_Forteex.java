package lab_prog.estruturas_condicionais.e_015;

import java.util.Scanner;

public class Bonus_Forteex{
    public static void main(String[]args){
        double salrio, tempo, bonus=0, extra=0, total;
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o seu salário: ");
        salrio = leia.nextDouble();
        System.out.print("Qual o seu tempo de casa: ");
        tempo = leia.nextDouble();

        if (salrio < 1200) {
            bonus = salrio * 0.15;
        }
        else if (salrio >= 1200.01 && salrio < 3500) {
            bonus = salrio * 0.12;
        }
        else if(salrio > 3500){
            bonus = salrio * 0.05;
        }
        if (tempo >= 3) {
            extra = salrio * 0.10;
        }
        total = salrio + extra + bonus;
        System.out.println("R$" + salrio + " e " + tempo + " anos de casa: bonus de R$" + bonus + " mais R$" + extra + "\n Total: R$" + total);

    }
}
