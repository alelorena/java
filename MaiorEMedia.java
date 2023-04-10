import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Faça um programa que leia 5 números
 * e informe o maior número e a média
 * desses números.
 */

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Número: ");
            try {
                numero = scan.nextInt();
                soma += numero;

                if (numero > maior) {
                    maior = numero;
                }

                count++;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Insira um número inteiro.");
                scan.nextLine(); // limpar o buffer de entrada
            }
        }

        scan.close();

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / 5.0));
    }
}
