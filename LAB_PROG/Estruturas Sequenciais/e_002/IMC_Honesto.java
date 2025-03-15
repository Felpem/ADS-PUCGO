package e_002;
import java.util.Scanner;
public class IMC_Honesto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double imc, altura, peso, m;
        String mensgimc = "";
        System.out.print("Peso:");
        peso = sc.nextDouble();
        System.out.print("Altura");
        altura = sc.nextDouble();
        m = altura / 100;
        imc = peso /(m * m);
        if (imc < 18.5){
            mensgimc = ("Abaixo do peso");
        }
        else if (imc > 18.5 && imc < 24.9) {
           mensgimc = ("Peso normal"); 
        }
        else if (imc > 25 && imc < 29.9) {
            mensgimc = ("Sobrepeso");
        }
        else if (imc > 30 && imc < 34.9) {
            mensgimc = ("Obesidade Leve");
        }
        else if (imc > 35 && imc < 39.9) {
            mensgimc = ("Obesidade moderada");
        }
        else if (imc > 40) {
            mensgimc = ("Obesidade Mórbida");
        }
        System.out.println(mensgimc);
    }
}
