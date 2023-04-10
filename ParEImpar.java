import java.util.Scanner;
/*
Faça um programa que peça N números intgeiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros = 0;
        while (quantNumeros == 0) {
            System.out.println("Digite a quantidade de números: ");
            try {
                quantNumeros = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }

        System.out.println("Digite " + quantNumeros + " números:");
        int quantPares = 0, quantImpares = 0;

        for (int i = 1; i <= quantNumeros; i++) {
            System.out.println("Número " + i + ":");
            try {
                int numero = Integer.parseInt(scan.nextLine());

                if (numero % 2 == 0) {
                    quantPares++;
                } else {
                    quantImpares++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                i--; // decrementa i para que o número inválido não seja contado
            }
        }

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de ímpares: " + quantImpares);

        scan.close();
    }
}
