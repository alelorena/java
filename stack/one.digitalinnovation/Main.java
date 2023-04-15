import java.util.Stack;

public class Main {

    public static void main(String args[]) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop()); // retira da pilha
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); // mostra mas não retira da pilha
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); // testa se a pilha está vazia

    }

}