package e_021;
import java.util.Scanner;
public class Reajuste_Segurex {
    public static void main(String[] args) {

        int codigo;
        String  cargo= new String(), porcento = new String();
        double salario_inicial, salario_final=0, diferenca;
        Scanner leia = new Scanner(System.in);

        System.out.println("Cargos\n[91] Gerente\n[92] Analista\n[93]Técnico");
        System.out.print("Código: ");
        codigo = leia.nextInt();
        if (codigo < 91){
            System.out.println("Valor Invalido!!!!!");
        }
        
        else{
            System.out.println("Qual o seu salario my Brother: ");
            salario_inicial = leia.nextDouble();
                switch (codigo){
                    case 91:
                        salario_final = salario_inicial + (salario_inicial * 0.1);
                        cargo = "Gerente";
                        porcento = "10%";
                        break;
                    case 92:
                        salario_final = salario_inicial + (salario_inicial * 0.2);
                        cargo = "Analista";
                        porcento = "20%";
                        break;
                    case 93:
                        salario_final = salario_inicial + (salario_inicial * 0.3);
                        cargo = "Técnico";
                        porcento = "30%";
                        break;
                    }
                    if (codigo > 93){
                        salario_final = salario_inicial + (salario_inicial * 0.355);
                            cargo = "Superior";
                            porcento = "35.5%";   
            }
            diferenca = salario_final - salario_inicial;
            System.out.print("O reajuste do seu salario como "+ cargo +" foi de "+ porcento + " com o valor antigo sendo R$" + salario_inicial + " e o novo valor sendo R$" + salario_final + " tendo uma diferença de R$" + diferenca);
        
        }
        }
    }
