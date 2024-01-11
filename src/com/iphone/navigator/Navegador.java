package com.iphone.navigator;

import com.interfaces.Navigator;

import java.util.Scanner;

public class Navegador implements Navigator {
    private String pageNow;

    @Override
    public void exibirPagina() {
        if (pageNow == null) {
            System.out.println("[!]nenhuma página a ser exibida");
        } else {
            System.out.printf("exibindo a página %s \n", pageNow);

        }

    }

    @Override
    public void adicionarPagina() {
        Scanner sc=new Scanner(System.in);
        System.out.println("insira o link da página: ");
        pageNow=sc.nextLine();
    }

    @Override
    public void recarregarPagina() {
        System.out.println("página recarregada!");
    }
}
