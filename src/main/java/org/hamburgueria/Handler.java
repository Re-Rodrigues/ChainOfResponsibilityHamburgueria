package org.hamburgueria;

public abstract class Handler {

    protected Handler proximo;

    public Handler setProximo(Handler proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract String processar(Pedido pedido);
}