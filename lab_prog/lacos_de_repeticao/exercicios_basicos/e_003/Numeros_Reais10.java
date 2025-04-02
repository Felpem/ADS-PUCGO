package lab_prog.lacos_de_repeticao.exercicios_basicos.e_003;
import java.util.Scanner;
public class Numeros_Reais10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int sequencia, maior, entrada;
        System.out.print("Num: ");
        maior = leia.nextInt();
        for(sequencia = 0; sequencia < 10; sequencia++){
            entrada = leia.nextInt();
            if (entrada > maior){
                maior = entrada;
            }
        }
        System.out.println("O maior número é " + maior);
    }
}
