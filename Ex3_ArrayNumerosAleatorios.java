
/* 
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100),
armazene-os num vetor.
Ao final, mostre os números e seus sucessores.
*/
import java.util.Random;

public class Ex3_ArrayNumerosAleatorios {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        // preenche o vetor com números aleatórios entre 0 e 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); // gera um número aleatório entre 0 e 100
        }

        // imprime os números e seus sucessores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " -> " + (numeros[i] + 1));
        }
    }
}
