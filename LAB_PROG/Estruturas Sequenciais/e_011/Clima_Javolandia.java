package e_011;
import java.util.Scanner;
public class Clima_Javolandia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double manha, tarde, noite;
        String msgalt = "", msgbaix = "";

        
        System.out.print("Temperatura Manhã: ");
        manha = leia.nextDouble();
        System.out.print("Temperatura Tarde: ");
        tarde = leia.nextDouble();
        System.out.print("Temperatura Noite: ");
        noite = leia.nextDouble();


            if (manha > tarde && manha > noite ){
                msgalt = "\nManhã foi mais alta";
            }
            else{
                msgbaix = "mais baixa foi Manha";
            }
            if(tarde > manha && tarde > noite){
                msgalt = "\nTarde foi mais alta";
            }
            else{
                msgbaix = "mais baixa foi Tarde";
            }
            if(noite > manha && noite > tarde){
                msgalt = "\nNoite foi mais alta";
            }
            else{
                msgbaix = "mais baixa foi Noite";
            }


        System.out.print(msgalt + " e " + msgbaix);
    }
}
