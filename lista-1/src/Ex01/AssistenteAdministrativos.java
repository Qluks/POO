package Ex01;
public class AssistenteAdministrativos extends Funcionario {

    private double adicionalNoturno;

    public AssistenteAdministrativos (String nome, double salario, double matricula) {
        super(nome, salario, matricula);
        this.adicionalNoturno = adicionalNoturno;
    }
    
    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        return (adicionalNoturno + super.getSalario()) * 12;
    }
}
