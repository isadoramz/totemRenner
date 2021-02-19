package versao1;

public enum TipoCliente {
    PESSOAFISICA(1, "Pessoa Física", 0.10),
    PESSOAJURIDICA(2, "Pessoa Jurídica", 0.20),
    FUNCIONARIO(3,"Funcionário", 0.30);

    private int cod;
    private String descricao;
    private double desconto;

    private TipoCliente (int cod, String descricao, double desconto) {
        this.cod = cod;
        this.descricao = descricao;
        this.desconto = desconto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public static TipoCliente encontrarPeloId(Integer cod){
        if (cod==null){
            return null;
        }
        for (TipoCliente enumAtual : TipoCliente.values()){
            if (cod.equals(enumAtual.getCod())){
                return enumAtual;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + cod);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
