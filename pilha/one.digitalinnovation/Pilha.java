public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setrefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getrefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = " ---------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += " ---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {

            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getrefNo() + "}]\n";
                noAuxiliar = noAuxiliar.getrefNo();
            } else {
                break;
            }
        }
        stringRetorno += " ---------------\n";
        return stringRetorno;
    }

    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
    }
}

class No {
    private int valor;
    private No refNo;

    public No(int valor) {
        this.valor = valor;
        this.refNo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getrefNo() {
        return refNo;
    }

    public void setrefNo(No refNo) {
        this.refNo = refNo;
    }
}
