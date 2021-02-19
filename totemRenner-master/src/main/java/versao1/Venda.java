package versao1;

public class Venda {

    Produto produto;
    Cliente cliente;

    public Venda(Cliente cliente, Produto produto) {
        this.produto = produto;
        this.cliente = cliente;
    }

    public void efetuarVenda() {

        int estoqueProduto = produto.getQuantidade();

        if(estoqueProduto == 0) {
            throw new RuntimeException("O produto não possui quantidade suficiente!");
        } else {

            float creditoCliente = cliente.getCredito();

            if(creditoCliente >= produto.getPreco()) {
                if(produto.getPreco() > 600) {
                    cliente.setCredito((creditoCliente - produto.getPreco()) + 50);
                    produto.setQuantidade(estoqueProduto - 1);
                } else {
                    cliente.setCredito(creditoCliente - produto.getPreco());
                    produto.setQuantidade(estoqueProduto - 1);
                }
            } else {
                throw new RuntimeException("O cliente não possui crédito suficiente!");
            }
        }

        // Tudo que precisamos para fazer uma venda simples sem promoção
        // Façam cada um em sua branch!

        // Como Criar branch:
        // git checkout -b seu_nome

        // Não esqueçam de dar push para enviar pro remoto!
        // Me mandem email se precisarem de ajuda, para qualquer ponto do exercício!
        // sabino.ws.rs@gmail.com

        // POO
        // 1 - Fazer todos os testes passarem -> 3
        // 2 - Criarem um novo cenário com um novo teste -> 5
        // 3 - Lei de Demeter e aplicar no código -> 2

        // Desafio
        // Aplicar promoção com Strategy e Factory na efetivação da venda e seus teste
        // 10 extras na disciplina
    }
}
