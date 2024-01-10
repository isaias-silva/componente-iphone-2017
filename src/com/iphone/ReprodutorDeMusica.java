package com.iphone;

public class ReprodutorDeMusica {
    private boolean inMusic;
    private String musicNow;

    public void tocar() {
        if (musicNow.isEmpty()) {
            System.out.println("musica não selecionada! selecione uma música");
            return;
        }
        inMusic = true;
        System.out.printf("tocando música: %s\n", musicNow);
    }

    public void parar() {
        if (!inMusic) {
            System.out.println("não há musica tocando.");
        } else {
            inMusic = false;
            System.out.println("musica parada.");
        }
    }
    public void selecionarMusica(String name) {
        musicNow = name;
        System.out.printf("musica selecionada %s \n",name);
    }
}
