package versao1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static versao1.TipoCliente.PESSOAFISICA;

class VendaTest {

    @Test
    public void deveDiminuirAQuantidadeDoProdutoAoFinalizarVenda(){
        // Given
        Cliente cliente = new Cliente("anonimo", "00000000000", PESSOAFISICA, 500f);
        Produto produto = new Produto(1, "Camisa", 100, 10);
        Venda venda = new Venda(cliente, produto);

        // When
        venda.efetuarVenda();

        // Then
        Assertions.assertEquals(9, venda.produto.getQuantidade());
    }

    @Test
    public void deveDiminuirOCreditoDoClienteBaseadoNoValorDoProdutoAoFinalizarVenda(){
        // Given
        Cliente cliente = new Cliente("anonimo", "00000000000", PESSOAFISICA, 500f);
        Produto produto = new Produto(1, "Camisa", 100, 10);
        Venda venda = new Venda(cliente, produto);

        // When
        venda.efetuarVenda();

        // Then
        Assertions.assertEquals(400, venda.cliente.getCredito());
    }

    @Test
    public void deveRetornarErroSeCreditoForMenorQueOValorDoProduto(){
        // Given
        Cliente cliente = new Cliente("anonimo", "00000000000", PESSOAFISICA, 90f);
        Produto produto = new Produto(1, "Camisa", 100, 10);
        Venda venda = new Venda(cliente, produto);

        // When
        Exception exception = assertThrows(Exception.class, () -> {
            venda.efetuarVenda();
        });

        // Then
        String expectedMessage = "O cliente não possui crédito suficiente!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void deveRetornarErroSeAQuantidadeDoProdutoForZero(){
        // Given
        Cliente cliente = new Cliente("anonimo", "00000000000", PESSOAFISICA, 200f);
        Produto produto = new Produto(1, "Camisa", 100, 0);
        Venda venda = new Venda(cliente, produto);

        // When
        Exception exception = assertThrows(Exception.class, () -> {
            venda.efetuarVenda();
        });

        // Then
        String expectedMessage = "O produto não possui quantidade suficiente!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void deveAdicionarCashBackDe50ReaisAoCreditoDoClienteQuandoComprarProdutoComValorMaiorQue600() {
        // Given
        Cliente cliente = new Cliente("anonimo", "00000000000", PESSOAFISICA, 800f);
        Produto produto = new Produto(1, "Camisa", 650, 10);
        Venda venda = new Venda(cliente, produto);

        // When

        venda.efetuarVenda();

        // Then
        Assertions.assertEquals(200, cliente.getCredito());
    }
}