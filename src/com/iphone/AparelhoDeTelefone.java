package com.iphone;

import java.util.ArrayList;

import static java.lang.System.out;

public class AparelhoDeTelefone {
    private ArrayList<Integer> inCall = new ArrayList<Integer>();
    private ArrayList<Integer> callSolitations = new ArrayList<Integer>();

    void ligar(int number) {
        if (inCall.contains(number)) {
            out.println("numero já está em ligação!");
            return;
        }
        inCall.add(number);
        out.printf("ligando para %d ...", number);

    }

    void atender() {
        if (callSolitations.isEmpty()) {
            out.println("não há chamadas!");
            return;
        } else {
            int call = callSolitations.get(0);
            out.printf("atendendo a ligação de %d", call);
            callSolitations.remove(0);
        }
    }
    void iniciarCorreioDeVoz(){

        out.println("correio de voz iniciado!");
    }

}
