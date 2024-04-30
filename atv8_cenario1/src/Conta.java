public class Conta {
    private String tipoConta;
    private String numUnico;
    private Integer validade;
    private Integer codigoValidar;
    private Double saldo;
    private Double rendimento;
    private Double manutencao;

    public String selecionarTipo(int op) throws Exception{
        switch (op) {
            case 1:
                tipoConta = "Conta Corrente";
            case 2:
                tipoConta = "Conta Poupança";
            default:
                throw new Exception("Opção inválida!");
        }
    }

    public String receberCartao() {
        return "Número único: " + numUnico +
                "\nValidade: " + validade +
                "\nCodigo de validação: " + codigoValidar;
    }

    public Double juros() {
        if(tipoConta.equals("Conta Poupança"))
            return saldo * (1 + rendimento);
        else
            return saldo;
    }

    public void setValidade(Integer validade) {
        this.validade = validade;
    }

    public void setNumUnico(String cpf) {
        this.numUnico = cpf;
    }

    public Double getRendimento() {
        return rendimento;
    }

    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }

    public Double getManutencao() {
        return manutencao;
    }

    public void setManutencao(Double manutencao) {
        this.manutencao = manutencao;
    }
}
