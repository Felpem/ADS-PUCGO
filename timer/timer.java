import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.*;

public class timer {

    public static void main(String[] args) throws Exception {
        int tempo;
        float ciclo = 0;
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Tempo em Segundos: ");
        tempo = sc.nextInt();


    while (tempo != 0){
        long start = System.currentTimeMillis();
        for (ciclo = 0; ciclo < 16; ciclo++){
            Thread.sleep(60); 
        }
        ciclo = 0;
        System.out.println(tempo);
        tempo--;
        }
        System.out.println("Tempo Esgotado!");    }
    }

