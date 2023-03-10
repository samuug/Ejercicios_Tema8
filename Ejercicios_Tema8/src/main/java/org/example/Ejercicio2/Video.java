package org.example.Ejercicio2;

import java.util.Scanner;

public class Video extends Obra{
    public static Scanner sc = new Scanner(System.in);
    public double duracion;

    public Video(String titulo, String autor, double duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public Video() {
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public Obra crearVideo(){
        System.out.println("Introduce el título del video");
        String titulo = sc.nextLine();
        System.out.println("Introduce el autor del video");
        String autor = sc.nextLine();
        System.out.println("Introduce la duracion del video(minutos)");
        double duracion = sc.nextDouble();
        return new Video(titulo, autor, duracion);
    }
}
