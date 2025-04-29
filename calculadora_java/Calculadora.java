package calculadora_java;
import java.util.Scanner;
import javax.swing.*;
public class Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entrada1, entrada2, resultado;
        int operacaoMatematica = 0, novamente=0;
        while(novamente != -1){
            System.out.println("==========================");
            System.out.println("| SUPER CALCULADORA v0.5 |");
            System.out.println("==========================");
            System.out.println();
            System.out.println("[1] ADIÇÃO");
            System.out.println("[2] SUBTRAÇÃO");
            System.out.println("[3] MULTIPLICAÇÃO");
            System.out.println("[4] DIVISÃO");
            System.out.println("[-1] SAIR/ENCERRAR");
            System.out.print("Qual operação deseja fazer: ");
            operacaoMatematica = sc.nextInt();
            System.out.print("Digite o valor 1: ");
            entrada1 = sc.nextDouble();
            System.out.print("Digite o valor 2: ");
            entrada2 = sc.nextDouble();

            switch (operacaoMatematica) {
                case 1:
                    resultado = entrada1 + entrada2;
                    System.out.println("==========================");
                    System.out.println("|        ADIÇÃO        |");
                    System.out.println("==========================");
                    System.out.println(entrada1 + " + " + entrada2 + " = " + resultado);
                    System.out.print("Voltar ao Inicio? [1] Voltar | [2] Encerrar: " );
                    novamente = sc.nextInt();
                    if (novamente == 2) {
                        novamente = -1;
                        System.out.println("Obrigado por usar!");
                        break;
                    }
                    break;
                case 2:
                    resultado = entrada1 - entrada2;
                    System.out.println("==========================");
                    System.out.println("|     SUBTRAÇÃO        |");
                    System.out.println("==========================");
                    System.out.println(entrada1 + " - " + entrada2 + " = " + resultado);
                    
                    System.out.print("Voltar ao Inicio? [1] Voltar | [2] Encerrar: " );
                    novamente = sc.nextInt();
                    if (novamente == 2) {
                        novamente = -1;
                        System.out.println("Obrigado por usar!");
                        break;
                    }
                    break;
                case 3:
                    resultado = entrada1 * entrada2;
                    System.out.println("==========================");
                    System.out.println("|     MULTIPLICAÇÃO       |");
                    System.out.println("==========================");
                        System.out.println(entrada1 + " x " + entrada2 + " = " + resultado);
                        System.out.print("Voltar ao Inicio? [1] Voltar | [2] Encerrar: " );
                        novamente = sc.nextInt();
                        if (novamente == 2) {
                            novamente = -1;
                            System.out.println("Obrigado por usar!");
                            break;
                        }
                    break;
                case 4:
                System.out.println("==========================");
                System.out.println("|         DIVISÃO        |");
                System.out.println("==========================");
                    if (entrada2 == 0) {
                        System.out.println(entrada1 + " ÷ " + entrada2 + " =  ∞");
                    }
                    else{
                        resultado = entrada1/entrada2;
                        System.out.println(entrada1 + " ÷ " + entrada2 + " = " + resultado);
                        
                        System.out.print("Voltar ao Inicio? [1] Voltar | [2] Encerrar: " );
                        novamente = sc.nextInt();
                        if (novamente == 2) {
                            novamente = -1;
                            System.out.println("Obrigado por usar!");
                            break;
                        }
                    }
                    break;
                case -1:
                    System.out.println("Obrigado por usar!");
                    break;
                default:
                    System.out.println("VALOR INVALIDO! TENTE NOVAMENTE");
            }
        }
    }
}