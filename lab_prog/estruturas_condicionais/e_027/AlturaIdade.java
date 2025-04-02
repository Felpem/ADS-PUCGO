package lab_prog.estruturas_condicionais.e_027;

import java.util.Scanner;

public class AlturaIdade {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double altura1, altura2, altura3, altura_media;
        int idade1, idade2, idade3;
        String nome1, nome2, nome3, mais_alto=null, mais_baixo=null, mais_velho=null, mais_novo=null ;

        System.out.print("Nome 1:");
        nome1 = leia.nextLine();

        System.out.print("Nome 2:");
        nome2 = leia.nextLine();

        System.out.print("Nome 3:");
        nome3 = leia.nextLine();


        System.out.print("Altura 1:");
        altura1 = leia.nextDouble();


        System.out.print("Idade 1:");
        idade1 = leia.nextInt();

        
        System.out.print("Altura 2:");
        altura2 = leia.nextDouble();


        System.out.print("Idade 2:");
        idade2 = leia.nextInt();


        System.out.print("Altura 3:");
        altura3 = leia.nextDouble();

        System.out.print("Idade 3:");
        idade3 = leia.nextInt();

        altura_media = (altura1 + altura2 + altura3)/3;

        if (altura1 <=0 && altura2 <=0 && altura3 <= 0 && idade1 < 0 && idade2 < 0 && idade3 < 0){
            System.out.println("ERRO\nENCERRADO");
        }
        
        
        if (altura1 > altura2 && altura1 > altura3 && idade1 > idade2 && idade1 > idade3){
            mais_alto = nome1 + " é o mais alto ";
            mais_velho = nome1 + " é o mais velho ";
        }
        else{
            mais_baixo = nome1 + " é o mais baixo ";
            mais_novo = nome1 + " é o mais novo ";
        }
        
        
        if (altura2 > altura1 && altura2 > altura3 && idade2 > idade1 && idade2 > idade3){
            mais_alto = nome2 + " é o mais alto ";
            mais_velho = nome2 + " é o mais velho ";
        }
        else{
            mais_alto = nome2 + " é o mais baixo ";
            mais_velho = nome2 + " é o mais velho ";
        }

        if (altura3 > altura1 && altura3 > altura2 && idade3 > idade1 && idade3 > idade2){
            mais_alto = nome3 + " é o mais alto ";
            mais_velho = nome3 + " é o mais velho ";
        }
        else{
            mais_alto = nome3 + " é o mais baixo ";
            mais_velho = nome3 + " é o mais novo ";        
        }
        System.out.printf("Quem é o mais alto: " + mais_alto +"\nQuem é o mais baixo: " + mais_baixo + "\nAltura Média:" + altura_media + "\nQuem é o mais velho: " + mais_velho + "\nQuem é o mais jovem: " + mais_novo);
        


    }
}
