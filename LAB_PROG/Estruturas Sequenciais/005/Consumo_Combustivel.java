import java.util.Scanner;

public class Consumo_Combustivel {
    public static void main(String[]args){
        String msg = "";
        Scanner leia = new Scanner(System.in);
        double distancia, litros, gasto;
        System.out.print("Km: ");
        distancia = leia.nextDouble();
        System.out.print("Litros: ");
        litros = leia.nextDouble();
        gasto = distancia / litros;
        if (gasto >= 15){
            msg = "Economico";
        }
        else{
            msg = "Não Economico";
        }
        System.out.print(msg);
    }
}