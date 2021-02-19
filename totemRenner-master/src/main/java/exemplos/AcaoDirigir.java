package exemplos;

public class AcaoDirigir implements AcaoInterface {

    @Override
    public void efetuarAcao() {
        throw new RuntimeException("Nao sei efetuar uma acao");
//        System.out.println("Estou dirigindo");
    }
}
