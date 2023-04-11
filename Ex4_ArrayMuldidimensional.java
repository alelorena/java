
/*
 Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 */
import java.util.Random;

public class Ex4_ArrayMuldidimensional {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        // preenche a matriz com valores aleatórios entre 0 e 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // gera um número aleatório entre 0 e 9
            }
        }

        // imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
