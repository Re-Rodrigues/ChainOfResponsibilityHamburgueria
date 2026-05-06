package org.hamburgueria;

public class Main {
    public static void main(String[] args) {

        Handler estoque = new EstoqueHandler();
        Handler pagamento = new PagamentoHandler();
        Handler preparo = new PreparoHandler();

        estoque.setProximo(pagamento).setProximo(preparo);

        Pedido pedido = new Pedido(true, true, true);

        System.out.println(estoque.processar(pedido));
    }
}