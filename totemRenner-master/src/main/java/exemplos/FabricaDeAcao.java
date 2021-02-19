package exemplos;

public class FabricaDeAcao {

    // Simple Factor
    // Permite encapsular a criação de um objeto

    public static AcaoInterface criarAcao(TipoAcao tipoAcao) {

        switch(tipoAcao){
            case DIRIGIR:
                return new AcaoDirigir();
            case PINTAR:
                return new AcaoPintar();
            default:
                return null;
        }

    }
}
