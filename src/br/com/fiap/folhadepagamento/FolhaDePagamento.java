package br.com.fiap.folhadepagamento;

public class FolhaDePagamento {

    public double salarioBruto;
    public int numeroDeDependentes;
    public int descontoINSS;
    public double valorPlanoDeSaude;

    public double calcularSalarioLiquido() {
        double inss = (salarioBruto * descontoINSS) / 100;
        double saude = valorPlanoDeSaude * numeroDeDependentes;
        double salarioLiquido =  salarioBruto - (inss + saude);

        System.out.println("Valor do INSS: " + descontoINSS + "\nNúmero de dependentes: " + numeroDeDependentes);
        System.out.println("Valor do plano de saúde: " + valorPlanoDeSaude + "\nValor salário bruto: " + salarioBruto);
        System.out.println("Valor do salário liquido: " + salarioLiquido);
        return salarioLiquido;
    }
}
