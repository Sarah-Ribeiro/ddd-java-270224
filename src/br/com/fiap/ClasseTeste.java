package br.com.fiap;

public class ClasseTeste {

    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.canal = 2;
        tv.volume = 5;

        tv.aumentarVolume();
        tv.mostrar();

        ArCondicionado ac = new ArCondicionado();

        ac.modo = "Resfriar";
        ac.temperatura = 22;

        ac.diminuirTemperatura();
        ac.mostrar();
    }

}
