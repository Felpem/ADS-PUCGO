package e_019;
import java.util.Scanner;
public class Lanchonete_Burgao {
    public static void main(String[] args) {
        int cod_sand, cod_beb;
        String sanduiche = new String(), bebida = new String();
        double total, preco_beb=0, preco_sand=0;
        Scanner leia = new Scanner(System.in);
        System.out.print("Sanduíche: ");
        cod_sand = leia.nextInt();
        System.out.print("Bebida: ");
        cod_beb = leia.nextInt();
        if (cod_beb >= 201 && cod_beb <= 203 && cod_sand >= 100 && cod_sand <= 103) {
            switch (cod_beb) {
                case 201:
                    preco_beb = 5;
                    bebida = "Refrigerante";
                    if (cod_sand == 100){
                        preco_sand = 5.2;
                        sanduiche = "Cachorro Quente";
                    }
                    else if(cod_sand == 101){
                        preco_sand = 4.30;
                        sanduiche = "Bauru Simples";
                    }
                    else if(cod_sand == 102){
                        preco_sand = 4.5;
                        sanduiche = "Bauru com Ovo";
                    }
                    else if(cod_sand == 103){
                        preco_sand = 5.10;
                        sanduiche = "Hamburguer";

                    }
                case 202:
                    preco_beb = 4.50;
                    bebida = "Suco";
                    if (cod_sand == 100){
                        preco_sand = 5.2;
                        sanduiche = "Cachorro Quente";
                    }
                    else if(cod_sand == 101){
                        preco_sand = 4.30;
                        sanduiche = "Bauru Simples";
                    }
                    else if(cod_sand == 102){
                        preco_sand = 4.5;
                        sanduiche = "Bauru com Ovo";
                    }
                    else if(cod_sand == 103){
                        preco_sand = 5.10;
                        sanduiche = "Hamburguer";

                    }
                case 203:
                    preco_beb = 2.7;
                    bebida = "Àgua Mineral";
                    if (cod_sand == 100){
                        preco_sand = 5.2;
                        sanduiche = "Cachorro Quente";
                    }
                    else if(cod_sand == 101){
                        preco_sand = 4.30;
                        sanduiche = "Bauru Simples";
                    }
                    else if(cod_sand == 102){
                        preco_sand = 4.5;
                        sanduiche = "Bauru com Ovo";
                    }
                    else if(cod_sand == 103){
                        preco_sand = 5.10;
                        sanduiche = "Hamburguer";

                    }
                }
                total = preco_beb + preco_sand;
                System.out.println("O combo de "+ sanduiche+ " e "+ bebida+ " ficou R$"+ total);
                
            }
                else{
                    System.out.println("ERRO");
                }
    }
    
}