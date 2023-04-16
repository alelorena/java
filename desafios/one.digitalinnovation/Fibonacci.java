import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro de 0 a 45: ");
            int N = leitor.nextInt();
            if (N >= 46) {
                System.out.println("Número inválido. Digite um valor menor que 46.");
            } else {
                int proximo, anterior = 0, atual = 1;
                for (int i = 1; i <= N; i++) {
                    if (i == N) {
                        System.out.println(anterior);
                    } else {
                        System.out.print(anterior + " ");
                    }
                    proximo = anterior + atual;
                    anterior = atual;
                    atual = proximo;
                }
            }
        }
    }
}
