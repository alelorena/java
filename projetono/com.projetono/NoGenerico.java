public class NoGenerico<T> {

    private T conteudo;
    private NoGenerico<T> proximoNo;

    public NoGenerico(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerico<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoGenerico<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
