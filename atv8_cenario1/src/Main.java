import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Agencia agencia1 = new Agencia();
        Funcionario funcionario1 = new Funcionario();
        Cliente cliente1 = new Cliente();
        Conta conta1 = new Conta();

        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String endereco = JOptionPane.showInputDialog("Digite seu endereco");
        String cpf = JOptionPane.showInputDialog("Digite seu cpf");
        String rg = JOptionPane.showInputDialog("Digite seu rg");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone");

        cliente1.setNome(nome);
        cliente1.setEndereco(endereco);
        cliente1.setCpf(cpf);
        cliente1.setRg(rg);
        cliente1.setTelefone(telefone);

        funcionario1.setNome(nome);
        funcionario1.setEndereco(endereco);
        funcionario1.setCpf(cpf);
        funcionario1.setRg(rg);
        funcionario1.setTelefone(telefone);



    }
}