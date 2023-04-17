import java.util.Scanner;

public class SomaDeHComNTermos {

    public static void main(String[] Args) {

        double h = 0;
        try (Scanner sc = new Scanner(System.in)) {
            double n = sc.nextDouble();

            for (int i = 1; i <= n; i++) {
                // TODO: Calcule o valor de H de forma que resulte na soma dos termos:
                h += 1.0 / i;
            }
        }
        // TODO: Imprima a soma dos termos, considerando um resultado com duas casas
        // decimais:
        int resultado = (int) Math.round(h);
        System.out.println(resultado);
    }
}