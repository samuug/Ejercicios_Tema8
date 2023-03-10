package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Obra {
    public static Scanner sc = new Scanner(System.in);
    public String titulo;
    public String autor;

    public Obra(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Obra() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Obra buscarObra(ArrayList<Obra> obras){
        System.out.println("Introduce el título de la obra");
        String titulo = sc.nextLine();
        for (Obra obra : obras) {
            if(obra.getTitulo().equals(titulo)){
                return obra;
            }
        }
        return null;
    }

}
