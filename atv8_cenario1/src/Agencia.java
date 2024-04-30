import java.util.ArrayList;

public class Agencia {
    private Integer codigo;
    private String endereco;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Cliente> clientes;

    public Agencia() {

        funcionarios = new ArrayList<>();
        clientes = new ArrayList<>();
    }

}
