import java.util.*;

public class Dragao {

    public static void main(String[] args) {

        int casos, poderDeLuta;

        try (Scanner ler = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            casos = ler.nextInt();

            for (int i = 0; i < casos; i++) {
                poderDeLuta = ler.nextInt();

                // Verifica se o poder de luta é maior ou igual a 8000
                if (poderDeLuta > 8000) {
                    System.out.println("Mais de 8000!");
                } else {
                    System.out.println("Inseto!");
                }
            }
        }
    }
}
