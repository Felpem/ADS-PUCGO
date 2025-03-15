package  e_006;
import java.util.Scanner;

public class Bissexto{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double ano, resto;
        String msg = "";
        System.out.print("Ano: ");
        ano = leia.nextDouble();
        resto = ano % 4;
        if (resto == 0){
            msg = "Bissexto";
        }
        else{
            msg = "Não Bissexto";
        }
        System.out.print(msg);
    }    
}
