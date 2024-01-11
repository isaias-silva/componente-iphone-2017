package com.iphone.call;

import com.interfaces.Call;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;
public class AparelhoDeTelefone implements Call {
    private ArrayList<String> inCall = new ArrayList<String>();
    private ArrayList<String> callSolitations = new ArrayList<String>();

    private boolean correioAberto;

    @Override
    public void ligar() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("[?] digite o telefone:");
        String number=scanner.next();

        if (inCall.contains(number)) {
            out.println("[!] numero já está em ligação!");
            return;
        }
        inCall.add(number);
        out.printf("[!] ligando para %s ...\n", number);

    }

    @Override
    public void atender() {

        if (callSolitations.isEmpty()) {
            out.println("[!] não há chamadas!");
            return;
        } else {
            String call = callSolitations.get(0);
            out.printf("[!] atendendo a ligação de %s", call);
            callSolitations.remove(0);
        }
    }

    @Override
    public  void iniciarCorreioDeVoz() {
        correioAberto = true;
        out.println("[!] correio de voz iniciado!");
    }

}
