public class Quadrados {
    public static void main(String[] args) {
        double quadrado;
        double ciclo;
        String numero;

        for(ciclo=0; ciclo < 100; ciclo++ ){
            quadrado = Math.pow((ciclo+1), 2);
            numero = String.format("%.0f", quadrado);
            System.out.println(numero);
        }
    }
}
