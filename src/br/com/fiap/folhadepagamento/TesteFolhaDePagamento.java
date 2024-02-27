package br.com.fiap.folhadepagamento;

public class TesteFolhaDePagamento {

    public static void main(String[] args) {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();

        folhaDePagamento.numeroDeDependentes = 3;
        folhaDePagamento.descontoINSS = 10;
        folhaDePagamento.valorPlanoDeSaude = 50;
        folhaDePagamento.salarioBruto = 5000;

        folhaDePagamento.calcularSalarioLiquido();
    }



}
