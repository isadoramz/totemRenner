package versao1;

import application.EntradaTerminal;

public class NewMenu {
    // Eu sou o cliente e passei as instrucoes pra voces
    // podem repassar para a Isadora se ela nao estava na reuniao de alinhamento

    // Sabino
    // Ronaldo
    // Isadora
    // Gabriel

    public static void main(String[] args) throws Exception {

        // Entrada do terminal inteiro
        System.out.println("Escolha o seu produto! Digite 1 para Camisa, 2 para Calça, 3 para Meia");
        EntradaTerminal entradaTerminal = new EntradaTerminal();
        Integer idDoProduto = entradaTerminal.entradaInteira();

        // Trouxemos um produto pelo id escolhido acima
        RepositorioArrayDeProduto repositorioDeProduto = new RepositorioArrayDeProduto();
        Produto produto = repositorioDeProduto.buscarProdutoPeloId(idDoProduto);

        // Escolhemos um id do tipo de cliente
        System.out.println("Escolha o seu tipo de cliente! Digite 1 - PF, 2 - PJ, 3 - FN");
        Integer idTipoCliente = entradaTerminal.entradaInteira();
        TipoCliente tipoCliente = TipoCliente.encontrarPeloId(idTipoCliente);
        Cliente cliente = new Cliente("anonimo", "00000000000", tipoCliente, 500f);

        Venda venda = new Venda(cliente, produto);
        venda.efetuarVenda();

        System.out.print("Valor do produto na Venda");
        System.out.println(venda.produto.getPreco());
        System.out.print("Credito do cliente na Venda");
        System.out.println(venda.cliente.getCredito());


        // Promoção
        // Fabrica
        // Strategy

    }

    public static void qualquerCoisa(){
        System.out.println("Qualquer coisa");
        System.out.println("Qualquer coisa");
        System.out.println("Qualquer coisa");
        System.out.println("Qualquer coisa");
        System.out.println("Qualquer coisa");
    }

}
