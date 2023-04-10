import java.util.Scanner;

/* 
 * Faça um programa que peça uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe o valor válido.
 */

public class Nota {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double nota;

        while(true) {
            try {
                System.out.print("Digite uma nota entre 0 e 10: ");
                nota = scan.nextDouble();
                
                if(nota >= 0 && nota <= 10) {
                    break;
                }
                else {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                }
            }
            catch(Exception e) {
                System.out.println("Entrada inválida! Digite um número.");
                scan.next();
            }
        }

        System.out.println("Nota válida: " + nota);

        scan.close();
    }
}

