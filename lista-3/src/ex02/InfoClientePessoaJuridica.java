package ex02;

public class InfoClientePessoaJuridica extends InfoCliente{
    String cnpj;

    public InfoClientePessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
