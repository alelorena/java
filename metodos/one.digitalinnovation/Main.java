public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora \n");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("\n Exercício mensagem \n");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("\n Exercício empréstimo \n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); // chamando um método dentro da classe calculaR
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);
    }
}
