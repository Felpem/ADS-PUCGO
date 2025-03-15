package e_007;

import java.util.Scanner;

public class Boletim_Meu_Jardim {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        double n1,n2,n3,n4, media;
        String aluno, situacao;
        System.out.print("Nome do Aluno: ");
        aluno = leia.next();
        System.out.print("Insira a Nota 1: ");
        n1 = leia.nextDouble();
        System.out.print("Insira a Nota 2: ");
        n2 = leia.nextDouble();
        System.out.print("Insira a Nota 3: ");
        n3 = leia.nextDouble();
        System.out.print("Insira a Nota 4: ");
        n4 = leia.nextDouble();

        media = (n1 + n2 + n3 + n4)/ 4;

        if (media >= 6){
            situacao = "Aprovado";
        }
        else{
            situacao =  "Reprovado";
        }
        System.out.printf(aluno + " " + situacao);
    }
}
