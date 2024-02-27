package br.com.fiap;

public class ArCondicionado {

    public int temperatura;

    public String modo;

    public void aumentarTemperatura() {
        temperatura++;
    }

    public void diminuirTemperatura() {
        temperatura--;
    }

    public void trocarModo(String mode) {
        mode = modo;
    }

    public void mostrar() {
        System.out.println("Modo: " + modo + "\nTemperatura: " + temperatura);
    }
}
