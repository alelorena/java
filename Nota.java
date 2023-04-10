import java.util.Scanner;

/* 
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe o valor válido.
 */

public class Nota {

    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
            double nota; 

            System.out.print("Digite uma nota entre 0 e 10: ");

            nota = scan.nextDouble();

            while(nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10: ");

                nota = scan.nextDouble();

            }
        }
        //System.out.println("Teste de push");
    }

}
