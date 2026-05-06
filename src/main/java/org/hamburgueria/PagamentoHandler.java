package org.hamburgueria;

public class PagamentoHandler extends Handler {

    @Override
    public String processar(Pedido pedido) {
        if (!pedido.isPagamentoAprovado()) {
            return "Pedido recusado: pagamento não aprovado";
        }
        if (proximo != null) {
            return proximo.processar(pedido);
        }
        return "Pedido aprovado";
    }
}