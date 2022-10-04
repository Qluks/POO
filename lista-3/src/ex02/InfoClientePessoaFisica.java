package ex02;
public class InfoClientePessoaFisica extends InfoCliente {
    String cpf;
    
    public InfoClientePessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
