import java.util.Scanner;
public class exerc2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double imc, altura, peso, m;
        System.out.print("Peso:");
        peso = sc.nextDouble();
        System.out.print("Altura");
        altura = sc.nextDouble();
        m = altura / 100;
        imc = peso /(m * m);
        if (imc < 18.5){
            System.err.println("Abaixo do peso");
        }
        else if (imc > 18.5 && imc < 24.9) {
           System.err.println("Peso normal"); 
        }
        else if (imc > 25 && imc < 29.9) {
            System.err.println("Sobrepeso");
        }
        else if (imc > 30 && imc < 34.9) {
            System.err.println("Obesidade Leve");
        }
        else if (imc > 35 && imc < 39.9) {
            System.err.println("Obesidade moderada");
        }
        else if (imc > 40) {
            System.err.println("Obesidade Mórbida");
        }

    }
}
