package model;

public class PilhaGenerica<T> {

     No<T> topo;

    public PilhaGenerica() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(T elemento) {
        No<T> novo = new No<>();
        novo.dado = elemento;
        novo.proximo = topo;
        topo = novo;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Não há elementos para desempilhar");
        }
        T valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

}
