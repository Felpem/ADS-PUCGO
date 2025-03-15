package _004;
import java.util.Scanner;

public class Maquina_Maluca {
    public static void main (String[]args){
        double numero, resto;
        String msg = "";
        Scanner leia = new Scanner(System.in);

        System.out.print("Numero: ");
        numero = leia.nextDouble();
        resto = numero % 2;
        if (resto == 0){
            msg = "Par";
            numero = Math.pow(numero, 2);
        }
        else{
            msg = "Impar";
            numero = Math.pow(numero, 3);        }
        System.out.print(msg +"\n" + numero);
    }
}
