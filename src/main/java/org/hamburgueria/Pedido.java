package org.hamburgueria;

public class Pedido {

    private boolean temEstoque;
    private boolean pagamentoAprovado;
    private boolean preparado;

    public Pedido(boolean temEstoque, boolean pagamentoAprovado, boolean preparado) {
        this.temEstoque = temEstoque;
        this.pagamentoAprovado = pagamentoAprovado;
        this.preparado = preparado;
    }

    public boolean isTemEstoque() {
        return temEstoque;
    }

    public boolean isPagamentoAprovado() {
        return pagamentoAprovado;
    }

    public boolean isPreparado() {
        return preparado;
    }
}