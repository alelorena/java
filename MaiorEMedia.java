import java.util.Scanner;
/** 
 * Faça um programa que leia 5 números
 * e informe o maior número e a média
 * desses números. 
 */
public class MaiorEMedia {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int maior = 0;
            int soma = 0;
            int count = 0;
            do {
                System.out.println("Numero: ");
                numero = scan.nextInt();

                soma = soma + numero;


                if (numero > maior) maior = numero;

                count = count + 1;      
                //System.out.println("Maior: " + maior); 
            } while(count < 5);
      System.out.println("Maior: " + maior);
      System.out.println("Soma: " + soma);
      System.out.println("Média: " + (soma / 5));
        }
    }
    
} 