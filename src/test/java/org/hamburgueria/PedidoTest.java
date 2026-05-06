package org.hamburgueria;

import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class PedidoTest {

    private Handler getFluxo() {
        Handler estoque = new EstoqueHandler();
        Handler pagamento = new PagamentoHandler();
        Handler preparo = new PreparoHandler();

        estoque.setProximo(pagamento).setProximo(preparo);

        return estoque;
    }

    @Test
    void deveAprovarPedido() {
        Pedido pedido = new Pedido(true, true, true);

        assertEquals("Pedido aprovado", getFluxo().processar(pedido));
    }

    @Test
    void deveRecusarSemEstoque() {
        Pedido pedido = new Pedido(false, true, true);

        assertEquals("Pedido recusado: sem estoque", getFluxo().processar(pedido));
    }

    @Test
    void deveRecusarSemPagamento() {
        Pedido pedido = new Pedido(true, false, true);

        assertEquals("Pedido recusado: pagamento não aprovado", getFluxo().processar(pedido));
    }

    @Test
    void deveRecusarSemPreparo() {
        Pedido pedido = new Pedido(true, true, false);

        assertEquals("Pedido recusado: não preparado", getFluxo().processar(pedido));
    }
}