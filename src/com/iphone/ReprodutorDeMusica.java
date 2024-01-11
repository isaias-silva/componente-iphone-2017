package com.iphone;

import java.util.Scanner;

public class ReprodutorDeMusica {
    private boolean inMusic;
    private String musicNow;

    public void tocar() {
        if (musicNow==null) {
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
    public void selecionarMusica() {
        System.out.println("digite o nome da música:");
        Scanner scanner=new Scanner(System.in);
        musicNow = scanner.nextLine();
        System.out.printf("musica selecionada %s \n",musicNow);
    }
}
