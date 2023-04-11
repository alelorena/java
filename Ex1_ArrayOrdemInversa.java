/*
Crie um vetor de 6 números inteiros e
mostre-os na ordem inversa.
 */
public class Ex1_ArrayOrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { -5, -6, 15, 50, 8, 4 }; // posições 0, 1, 2, 3, 4, 5 = 6 elementos

        // System.out.println(vetor.length); // retorna o tamanho do vetor

        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        // mostrando na ordem inversa
        System.out.println("\nvetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }
}
