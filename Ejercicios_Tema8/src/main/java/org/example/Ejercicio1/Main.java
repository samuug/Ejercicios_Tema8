package org.example.Ejercicio1;


import static org.example.Ejercicio1.JugadorGuerra.ganador;

public class Main {
    public static void main(String[] args) {
        JugadorGuerra jugador1 = new JugadorGuerra(10, "Jugador 1", new Dado(), 10);
        JugadorGuerra jugador2 = new JugadorGuerra(10, "Jugador 2", new Dado(), 10);
        jugador1.preguntarNombre();
        jugador2.preguntarNombre();
        while (!ganador(jugador1, jugador2)){
            jugador1.tirarDado();
            jugador2.tirarDado();
            System.out.println(jugador1.getNombre()+" ha sacado un " + jugador1.getDado().getUltimaCara() + " y "+jugador2.getNombre()+" ha sacado un " + jugador2.getDado().getUltimaCara());
            jugador1.comprobarGanador(jugador1, jugador2);
            System.out.println("Marcador: " + jugador1.getNombre() + " " + jugador1.getContador() + " - " + jugador2.getNombre() + " " + jugador2.getContador());
            System.out.println("______________________________________________");
        }
    }
}