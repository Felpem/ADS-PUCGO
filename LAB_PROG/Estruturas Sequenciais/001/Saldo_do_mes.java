import java.util.Scanner;
public class Saldo_do_mes {
    public static void main(String[] args) {
        int credito, debito, sldoin, sldofim;
        String msg = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo Inicial: ");
        sldoin = sc.nextInt();
        System.out.print("Débitos: " );
        debito = sc.nextInt();
        System.out.print("Créditos: ");
        credito = sc.nextInt();
        sldofim = sldoin + credito - debito;
        if (sldofim == 0){
            msg = "Saldo Zerado ";
       }
       else{
            if (sldofim < 0){
                msg = "Saldo negativo em R$";
            } else{
                msg = "Saldo positivo em R$";
            }
        
       }
       System.out.printf(msg + sldofim);
    }

}
