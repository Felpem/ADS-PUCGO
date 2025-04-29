import java.util.Scanner;
public class timer {

    public static void main(String[] args) throws Exception {
        int tempo;
        float ciclo = 0;
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Tempo em Segundos: ");
        tempo = sc.nextInt();


    while (tempo != 0){
        for (ciclo = 0; ciclo < 16; ciclo++){
            Thread.sleep(60); 
        }
        ciclo = 0;
        System.out.print("|" + tempo + "...");
        tempo--;
        }
        System.out.println("Tempo Esgotado!");    }
    }

