import java.util.Scanner;

/* 
Faça um programa que leia um vetor de 6 caracteres e
diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_ArrayConsoantes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[] consoantes = new String[6];
            int quantidadeConsoantes = 0;

            for (int i = 0; i < consoantes.length; i++) {
                System.out.println("Letra: ");
                String letra;
                do {
                    try {
                        letra = scan.next();
                        if (!letra.matches("[a-zA-Z]")) {
                            throw new Exception("Caracter inválido! Digite uma letra:");
                        } else if (Character.isDigit(letra.charAt(0))) {
                            throw new Exception("Números não são permitidos! Digite uma letra:");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                } while (true);

                if (!(letra.equalsIgnoreCase("a") ||
                        letra.equalsIgnoreCase("e") ||
                        letra.equalsIgnoreCase("i") ||
                        letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u"))) {

                    consoantes[quantidadeConsoantes] = letra;
                    quantidadeConsoantes++;
                }
            }

            System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
            System.out.print("As consoantes são: ");
            for (int i = 0; i < quantidadeConsoantes; i++) {
                System.out.print(consoantes[i] + " ");
            }
        }
    }
}
