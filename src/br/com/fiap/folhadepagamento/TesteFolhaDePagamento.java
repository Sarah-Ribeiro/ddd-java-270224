package br.com.fiap.folhadepagamento;

public class TesteFolhaDePagamento {

    public static void main(String[] args) {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        folhaDePagamento.numeroDeDependentes = 2;
        folhaDePagamento.descontoINSS = 10;
        folhaDePagamento.valorPlanoDeSaude = 50.00;
        folhaDePagamento.salarioBruto = 5000;

        System.out.println("Seu salário líquido é " + folhaDePagamento.calcularSalarioLiquido());
    }



}
