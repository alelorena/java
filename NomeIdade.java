
//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            String nome;
            int idade;
            while (true) {
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0"))
                    break;
                try {
                    System.out.println("Idade: ");
                    idade = scan.nextInt();

                    if (idade < 0) {
                        System.out.println("Idade inválida! Insira um valor maior ou igual a zero.");
                        continue; // volta para o início do loop
                    }

                    // fazer algo com o nome e idade
                } catch (InputMismatchException e) {
                    System.out.println("Idade inválida! Tente novamente.");
                    scan.nextLine(); // limpar o buffer de entrada
                }
            }
        }

        System.out.println("Foi inserido o valor 0. O programa foi parado!");
    }
}
