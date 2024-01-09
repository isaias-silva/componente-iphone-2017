package com.iphone;

import com.ascii.AsciiArt;
import com.interfaces.Phone;

import java.util.Scanner;

public class Iphone implements Phone {
    private String name;

    private ReprodutorDeMusica reprodutorDeMusica;
    private AparelhoDeTelefone aparelhoDeTelefone;

    public Iphone(String name_set) {
        name = name_set;
        reprodutorDeMusica = new ReprodutorDeMusica();
        aparelhoDeTelefone = new AparelhoDeTelefone();
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            System.out.println(AsciiArt.PHONE.art);
            System.out.println("""
                                        
                    [1] -> reprodutor de música
                    [2] -> navegador de internet
                    [3] -> telefonema
                    [0] -> desligar
                    """);


            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    AbrirReprodutorDeMusica();
                    exit = true;
                    break;
                }
                case 2: {
                    AbrirAgendaTelefonica();
                    exit = true;
                    break;
                }
                case 3: {
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("use um comando válido");
                }

            }
        }

    }

    ;

    @Override
    public void AbrirReprodutorDeMusica() {
        System.out.println("""
                               
                [1] -> tocar música
                [2] -> parar música
                [0] -> sair
                                
                """);
    }

    @Override
    public void AbrirAgendaTelefonica() {
        System.out.println("""
                               
                [1] -> abrir correio de voz
                [2] -> ligar
                [3] -> atender ligações
                [0] -> sair
                """);
    }
}
