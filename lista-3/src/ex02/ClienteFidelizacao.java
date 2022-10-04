package ex02;
public class ClienteFidelizacao extends Cliente{

    double bonus;
    String validade;

    public ClienteFidelizacao(String nome, String endereco, String valor, double bonus, String validade) {
        super(nome, endereco, valor);

        this.bonus = bonus;
        this.validade = validade;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getValidade() {
        return validade;
    }

    public String adicionaBonus(String valor) {
        return getValor() + getBonus() * 00.5;
    }
    
}
