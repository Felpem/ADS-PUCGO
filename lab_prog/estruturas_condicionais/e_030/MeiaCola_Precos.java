package lab_prog.estruturas_condicionais.e_030;

import java.util.Scanner;

public class MeiaCola_Precos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantidade, codigo, tipo;
        double preco=0;

        System.out.println("====================");
        System.out.println("|     MEIA COLA    |");
        System.out.println("====================");

        System.out.println("CÓDIGO | PRODUTO | TIPO |       PREÇO R$");
        System.out.println("  1    |  Meia-Cola | Normal/Diet | 1,50/1,70");
        System.out.println("  2    |  Limonax | Normal/Diet | 1,60/1,70");
        System.out.println("  3    |  Oranginha | Normal/Diet | 1,40/1,45");

        System.out.print("Digite o código do produto: ");
        codigo = leia.nextInt();
        System.out.print("Qual o Tipo da Bebida; [1]Normal,[2]Diet: ");
        tipo = leia.nextInt();
        System.out.print("Quantos refrigerantes: ");
        quantidade = leia.nextInt();


        switch (codigo) {
            case 1:
                switch (tipo) {
                    case 1:
                        preco = quantidade * 1.5;
                        break;
                
                    case 2:
                        preco = quantidade * 1.7;
                        break;
                }
                break;
            case 2:
                switch (tipo) {
                    case 1:
                        preco = quantidade * 1.6;
                        break;
                
                    case 2:
                        preco = quantidade * 1.7;
                        break;
                }
                break;
            case 3:
                switch (tipo) {
                    case 1:
                        preco = quantidade * 1.4;
                        break;
                
                    case 2:
                        preco = quantidade * 1.45;
                        break;
                }
                break;
        }
        System.out.println("O preço dos refrigerantes foram R$"+ preco);
        leia.close();
    }
}