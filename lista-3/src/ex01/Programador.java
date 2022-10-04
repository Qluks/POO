package ex01;
public class Programador extends Funcionario{
    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        setSalario(getSalario() + getSalario() * 0.2);
    }
}
