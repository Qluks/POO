package ex02;
public class Cliente {
    String nome;
    String endereco;
    String valor;

    public Cliente (String nome, String endereco, String valor) {
        this.nome = nome;
        this.endereco = endereco;
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
