package lab_prog.estruturas_condicionais.e_020;
import java.util.Scanner;

public class Credito_GranaBoa {
    public static void main(String[] args) {
        double saldo, credito=0;
        Scanner leia = new Scanner(System.in);
        String msg = new String();

        System.out.print("Insira o saldo: ");
        saldo = leia.nextDouble();

        if (saldo <= 200){
            System.out.println("SEM CRÉDITO");
            msg = "0";

        }
        else if( saldo >= 200 && saldo < 1000){
            credito = saldo +(saldo * 0.2);
            msg = "20";

        }
        else if( saldo >= 1000 && saldo < 2000){
            credito = saldo +(saldo * 0.3);
            msg = "30";

        }
        else{       
            credito = saldo + (saldo*0.4);
            msg = "40";
        }
        
        System.out.print("o saldo com um credito de " +  msg + "% foi de R$" + credito);

    }
}
