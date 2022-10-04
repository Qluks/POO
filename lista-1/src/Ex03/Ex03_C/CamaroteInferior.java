package Ex03.Ex03_C;

import Ex03.Ex03_A.VIP;

public class CamaroteInferior extends VIP {
    private String localizacao = "ponta esquerda";

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public CamaroteInferior(double valor) {
        super(valor);
    }

    public void imprimirLocalizacao() {
        System.out.println(localizacao);
    }
}
