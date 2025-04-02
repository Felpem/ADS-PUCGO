package lab_prog.estruturas_condicionais.e_010;

import java.util.Scanner;

public class Eleicão_Sindico {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String sind1, sind2, sind3, msg;
        int voto1, voto2, voto3;

        System.out.print("Sindico 1: ");
        sind1 = leia.next();
        
        System.out.print("Sindico 2: ");
        sind2 = leia.next();
        
        System.out.print("Sindico 3: ");
        sind3 = leia.next();
        System.out.print("Votos sindico 1: ");
        voto1 = leia.nextInt();
        System.out.print("Votos sindico 2: ");
        voto2 = leia.nextInt();
        System.out.print("Votos sindico 3: ");
        voto3 = leia.nextInt();
        
        if (voto1 > voto2 && voto1 > voto3) {
            msg = "O " + sind1 + " ganhou com " + voto1 + " votos.";
        }
        else if (voto2 > voto1 && voto2 > voto3) {
            msg = "O " + sind2 + " ganhou com " + voto2 + " votos.";
        }
        else{
            msg = "O " + sind3 + " ganhou com " + voto3 + " votos.";
        }
        System.out.print(msg);
    }
}
