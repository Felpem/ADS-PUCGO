package calculadora_java;
import java.util.Scanner;
import javax.swing.*;
public class Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JTextField numero1= new JTextField(), numero2, resultado;

        JFrame janelaCalculadora = new JFrame("Calculadora v0.6");
        janelaCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numero1.getText();

        
        janelaCalculadora.pack();
        janelaCalculadora.setVisible(true);
        
    }
}