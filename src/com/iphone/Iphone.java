package com.iphone;

import com.ascii.AsciiArt;
import com.interfaces.Call;
import com.interfaces.MusicPlayer;
import com.interfaces.Navigator;
import com.interfaces.Phone;

import com.iphone.call.AparelhoDeTelefone;
import com.iphone.musicPlayer.ReprodutorDeMusica;
import com.iphone.navigator.Navegador;

import java.util.Scanner;

public class Iphone implements Phone {
    private String name;

    private MusicPlayer reprodutorDeMusica;
    private Call aparelhoDeTelefone;

    private Navigator navegador;
    public Iphone(String name_set) {
        name = name_set;
        reprodutorDeMusica = new ReprodutorDeMusica();
        aparelhoDeTelefone = new AparelhoDeTelefone();
        navegador=new Navegador();
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
            System.out.println("-----["+name+"]-----");
            System.out.println("""
                                        
                    [1] -> reprodutor de música
                    [2] -> telefone
                    [3] -> navegador
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
                    start();
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
        boolean exit = false;

        while (!exit) {

            System.out.println("""
                    [1] -> selecionar música         
                    [2] -> tocar música
                    [3] -> parar música
                                        
                    [0] -> sair
                                    
                    """);
            Scanner prompt = new Scanner(System.in);
            int option = prompt.nextInt();
            switch (option) {
                case 1: {
                    reprodutorDeMusica.selecionarMusica();
                    break;
                }
                case 2: {
                    reprodutorDeMusica.tocar();
                    break;
                }
                case 3: {
                    reprodutorDeMusica.parar();
                    break;
                }
                case 0: {
                    exit = true;
                    start();
                    break;
                }
                default: {
                    System.out.println("use um comando válido");
                }

            }
        }
    }

    @Override
    public void AbrirAgendaTelefonica() {

        boolean exit = false;


        while (!exit) {

            System.out.println("""
                                   
                    [1] -> abrir correio de voz
                    [2] -> ligar
                    [3] -> atender ligações
                    [0] -> sair
                    """);

            Scanner prompt = new Scanner(System.in);
            int option = prompt.nextInt();
            switch (option) {
                case 1: {

                    aparelhoDeTelefone.iniciarCorreioDeVoz();

                    break;
                }
                case 2: {

                    aparelhoDeTelefone.ligar();

                    break;
                }
                case 3: {
                    aparelhoDeTelefone.atender();

                    break;
                }
                case 0: {
                    exit = true;
                    start();
                    break;
                }
                default: {
                    System.out.println("use um comando válido");
                }

            }
        }
    }

    @Override
    public void AbrirNavegador() {
        boolean exit = false;


        while (!exit) {

            System.out.println("""
                                   
                    [1] -> exibir pagina
                    [2] -> nova página
                    [3] -> recarregar página
                    [0] -> sair
                    """);

            Scanner prompt = new Scanner(System.in);
            int option = prompt.nextInt();
            switch (option) {
                case 1: {

                    navegador.exibirPagina();

                    break;
                }
                case 2: {

                    navegador.adicionarPagina();

                    break;
                }
                case 3: {
                    navegador.recarregarPagina();

                    break;
                }
                case 0: {
                    exit = true;
                    start();
                    break;
                }
                default: {
                    System.out.println("use um comando válido");
                }

            }
        }
    }
}
