package versao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositorioArrayDeProdutoTest {


    @Test
    public void deveBuscarProdutoCamisaQuandoPassarIdUm(){
        RepositorioArrayDeProduto repositorioDeProduto = new RepositorioArrayDeProduto();
        Integer idDeUmProduto = 1;

        Produto produtoEncontrado = repositorioDeProduto.buscarProdutoPeloId(idDeUmProduto);

        Produto produtoEsperado = new Produto(1, "Camisa", 100, 1);

        assertEquals(produtoEsperado, produtoEncontrado);
    }

    @Test
    public void deveBuscarProdutoBermudaQuandoPassarIdDois(){
        RepositorioArrayDeProduto repositorioDeProduto = new RepositorioArrayDeProduto();
        Integer idDeUmProduto = 2;

        Produto produtoEncontrado = repositorioDeProduto.buscarProdutoPeloId(idDeUmProduto);

        Produto produtoEsperado = new Produto(2, "Bermuda", 50, 1);

        assertEquals(produtoEsperado, produtoEncontrado);
    }

    @Test
    public void deveBuscarProdutoMeiaQuandoPassarIdTres(){
        RepositorioArrayDeProduto repositorioDeProduto = new RepositorioArrayDeProduto();
        Integer idDeUmProduto = 3;

        Produto produtoEncontrado = repositorioDeProduto.buscarProdutoPeloId(idDeUmProduto);

        Produto produtoEsperado = new Produto(3, "Meia", 20, 1);

        assertEquals(produtoEsperado, produtoEncontrado);
    }

    @Test
    public void deveRetornarExceptionAoBuscarOProdutoQuandoPassarUmIdNulo(){
        RepositorioArrayDeProduto repositorioDeProduto = new RepositorioArrayDeProduto();
        Integer idDeUmProduto = null;

        Exception exception = assertThrows(Exception.class, () -> {
            Produto produto = repositorioDeProduto.buscarProdutoPeloId(idDeUmProduto);
        });

        String expectedMessage = "A busca nao aceita nulo!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}