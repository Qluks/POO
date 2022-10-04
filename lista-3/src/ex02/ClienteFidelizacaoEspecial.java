package ex02;
public class ClienteFidelizacaoEspecial extends ClienteFidelizacao {
    public ClienteFidelizacaoEspecial(double bonus, String validade, String nome, String endereco, String valor) {
        super(nome, endereco, valor, bonus, validade);
    }

    public String adicionaBonus(String valor) {
        return getValor() + getBonus() * 0.1;
    }
}
