public class Main {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.print("Fila com 4 objetos: ");
        System.out.println(minhaFila + "\n");

        System.out.print("Retira o primeiro da fila: >>>>> ");
        System.out.println(minhaFila.dequeue() + "\n"); //retira o primeiro da fila

        System.out.print("Fila com 3 objetos: ");
        System.out.println(minhaFila + "\n");

        System.out.print("Inclui 1 objeto no final da fila: ");
        minhaFila.enqueue(new No("ultimo")); // inclui um no fim da fila

        System.out.println(minhaFila + "\n");

        System.out.print("Pegando o 1º atual da fila: ");
        System.out.println(minhaFila.first() + "\n"); // pega o atual primeiro da fila

        System.out.println(minhaFila + "\n");

    }

}