import java.util.InputMismatchException;
import java.util.Scanner;

/* 
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 Ex: 5!= 120 (5 x 4 x 3 x 2 x 1)
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 0;
        do {
            try {
                System.out.print("Fatorial do número: ");
                fatorial = scan.nextInt();

                if (fatorial <= 0 || fatorial > 19) {
                    System.out.println("Valor inválido! Insira um número positivo de 1 a 19.");
                    fatorial = 0; // atribuir valor inválido para forçar a repetição
                }

            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Insira um número inteiro.");
                scan.nextLine(); // limpar o buffer de entrada
            }
        } while (fatorial <= 0);

        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println("O " + fatorial + "! = " + multiplicacao);

        scan.close();

    }
}
