package lab_prog.estruturas_condicionais.e_003;
import java.util.Scanner;
public class Belas_Artes_Day {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double dia, idade, ingresso;
        System.out.print("Dia: ");
        dia = leia.nextDouble();
        System.out.print("Idade: ");
        idade = leia.nextDouble();
        System.out.print("Ingresso: ");
        ingresso = leia.nextDouble();
            if (idade <= 14 && dia == 3){
                ingresso = (ingresso/2) * 0.5;
            }
            else{
                ingresso = ingresso / 2;
            }
        System.out.printf("valor ingresso R$" + ingresso);
    }
}
