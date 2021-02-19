package exemplos;

public class Robozinho {

    private AcaoInterface acao;

    // Modo sem Strategy
    public void agir(String acao) {
        if("dirigir".equals(acao)) {
            new AcaoDirigir().efetuarAcao();
        } else if("pintar".equals(acao)){
            new AcaoPintar().efetuarAcao();
        } else if("outra coisa".equals(acao)){
            System.out.println("Estou fazendo outra coisa");
            // Calculo
        }
    }

    // Construtor
    public Robozinho(AcaoInterface acao) {
        this.acao = acao;
    }

    // Strategy
    /**
     * O Strategy é um padrão de projeto comportamental
     * que permite que você defina uma família de algoritmos,
     * coloque-os em classes separadas, e faça os objetos deles intercambiáveis.
     */

    public void efetuarRotina() {
        acao.efetuarAcao();
    }

}
