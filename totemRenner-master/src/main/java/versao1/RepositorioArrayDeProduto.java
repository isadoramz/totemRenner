package versao1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class RepositorioArrayDeProduto implements RepositorioDeProdutoInterface{

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public RepositorioArrayDeProduto() {
        Produto camisa = new Produto(1, "Camisa", 100, 10);
        Produto bermuda = new Produto(2, "Bermuda", 50, 10);
        Produto meia = new Produto(3, "Meia", 20, 10);

        produtos.add(camisa);
        produtos.add(bermuda);
        produtos.add(meia);
    }

    public Produto buscarProdutoPeloId(Integer idDoProduto) {
        if(idDoProduto == null)
            throw new RuntimeException("A busca nao aceita nulo!");

        Optional<Produto> produto = produtos.stream()
                .filter(prod -> prod.getId() == idDoProduto).findFirst();

        return produto.get();
    }
}
