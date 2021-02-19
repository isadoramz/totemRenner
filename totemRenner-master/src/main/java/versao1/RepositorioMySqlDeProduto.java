package versao1;

import java.util.ArrayList;
import java.util.Optional;

public class RepositorioMySqlDeProduto implements RepositorioDeProdutoInterface{

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public RepositorioMySqlDeProduto() {

    }

    public Produto buscarProdutoPeloId(Integer idDoProduto) {
        // new COnnection
        // findById()
        return null;
    }
}
