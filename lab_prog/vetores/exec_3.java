package lab_prog.vetores;
import java.util.Scanner;
public class exec_3 {
    public static void main(String[] args) {
        double[] media50 = new double[20];
        double media, cont=0, soma_media=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++){
            System.out.print("Digite o " + (media50[i]+1) + "° valor: ");
            media50[i] = sc.nextDouble();

            if (media50[i] >= 50) {
                cont++;
                soma_media = soma_media+media50[i];
            }
        }
        for(int i = 0; i < 20; i++){
            if (media50[i] >= 50) {
                System.out.print(media50[i] + " | ");   
            }
        }
        media = soma_media/cont;
        System.out.println("A média dos valores é: " + media);
    }
}
