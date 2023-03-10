package org.example.Ejercicio1;

import java.util.Scanner;

public class JugadorGuerra extends Dado{
    private static Scanner sc = new Scanner(System.in);
    public int numeroFichas;
    public String nombre;
    public Dado dado;
    public int contador;

    public JugadorGuerra(int numeroFichas, String nombre, Dado dado, int contador) {
        this.numeroFichas = numeroFichas;
        this.nombre = nombre;
        this.dado = dado;
        this.contador = contador;
    }

    public int getNumeroFichas() {
        return numeroFichas;
    }

    public void setNumeroFichas(int numeroFichas) {
        this.numeroFichas = numeroFichas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void tirarDado(){
        this.dado.lanzarDado();
    }

    public void comprobarGanador(JugadorGuerra jugador1, JugadorGuerra jugador2){
        if (jugador1.getDado().getUltimaCara() > jugador2.getDado().getUltimaCara()){
            jugador1.setContador(jugador1.getContador() + 1);
            jugador2.setContador(jugador2.getContador() - 1);
            System.out.println(jugador1.getNombre() + " ha ganado la ronda");
        } else if (jugador1.getDado().getUltimaCara() < jugador2.getDado().getUltimaCara()){
            jugador1.setContador(jugador1.getContador() - 1);
            jugador2.setContador(jugador2.getContador() + 1);
            System.out.println(jugador2.getNombre() + " ha ganado la ronda");
        }
    }

    public void preguntarNombre(){
        System.out.println("Introduce el nombre del jugador: ");
        setNombre(sc.nextLine());
    }

    public static boolean ganador(JugadorGuerra jugador1, JugadorGuerra jugador2){
        if (jugador1.getContador() == 0){
            System.out.println(jugador2.getNombre()+" ha ganado la partida");
            return true;
        } else if (jugador2.getContador() == 0){
            System.out.println(jugador1.getNombre()+" ha ganado la partida");
            return true;
        }
        return false;
    }
}
