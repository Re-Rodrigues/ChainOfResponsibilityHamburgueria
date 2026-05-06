package org.hamburgueria;

public class PreparoHandler extends Handler {

    @Override
    public String processar(Pedido pedido) {
        if (!pedido.isPreparado()) {
            return "Pedido recusado: não preparado";
        }
        if (proximo != null) {
            return proximo.processar(pedido);
        }
        return "Pedido aprovado";
    }
}