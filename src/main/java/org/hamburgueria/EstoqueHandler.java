package org.hamburgueria;

public class EstoqueHandler extends Handler {

    @Override
    public String processar(Pedido pedido) {
        if (!pedido.isTemEstoque()) {
            return "Pedido recusado: sem estoque";
        }
        if (proximo != null) {
            return proximo.processar(pedido);
        }
        return "Pedido aprovado";
    }
}