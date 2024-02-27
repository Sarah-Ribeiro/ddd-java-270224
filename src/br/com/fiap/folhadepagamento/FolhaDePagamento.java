package br.com.fiap.folhadepagamento;

public class FolhaDePagamento {

    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido() {
        double inss, planoSaude;
        inss = salarioBruto * (descontoINSS / 100);
        planoSaude = valorPlanoDeSaude * (numeroDeDependentes + 1);

        return salarioBruto - (inss + planoSaude);
    }
}
