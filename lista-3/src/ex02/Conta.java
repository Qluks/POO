package ex02;

public class Conta {
    private String nomedocliente;
    private double numerodaconta;
    private double saldo;
    private double limite;
    
    public Conta(String nomedocliente, double numerodaconta, double saldo, double limite) {
        this.nomedocliente = nomedocliente;
        this.numerodaconta = numerodaconta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void setNomedocliente(String nomedocliente) {
        this.nomedocliente = nomedocliente;
    }

    public String getNomedocliente() {
        return nomedocliente;
    }

    public void setNumerodaconta(double numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    public double getNumerodaconta() {
        return numerodaconta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    private void deposito() {
    }

    private boolean saque() {
        return true;
    }
}
