package lab_prog.vetores;
import java.util.Scanner;
public class exec_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] imparPar = new int[15];
        int resto, contImpar=0, contPar=0;

        for(int i = 0; i < 15; i++){
            System.out.print("Digite o "+ (imparPar[i]+1) + " valor: ");
            imparPar[i] = sc.nextInt();
            resto = imparPar[i] % 2;
            if (resto == 0){
                contPar++;
            }
            else{
                contImpar++;
            }
        }
        System.out.println("Contem " + contPar + " valores pares e " + contImpar + " impares.");
    }
}
