package _018;
import java.util.Scanner;
    public class Balas{
        public static void main(String[]args){
            double valor = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Quantas balas deseja comprar? ");
            double bl = sc.nextDouble();
            if(bl <= 0){
                System.out.print("Valor Invalido!");
            }
                else{
                    if (bl < 50){
                        valor = bl * 0.3;
                    }
                    else if (bl > 50 && bl < 101){
                        valor = bl * 0.25;
                    }
                    else if (bl >= 101 && bl < 201){
                        valor = bl * 0.22;
                    }
                    else if (bl >= 201 && bl <= 400){
                        valor = bl * 0.17;
                    }
                    else if(bl > 401){
                        valor = bl * 0.15;
                    }
                }
            System.out.print("As balas ficaram R$" + valor);
        }
    }