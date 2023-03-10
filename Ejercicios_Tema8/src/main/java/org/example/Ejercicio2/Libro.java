package org.example.Ejercicio2;

import java.util.Scanner;

public class Libro extends Obra{
    public static Scanner sc = new Scanner(System.in);
    public int paginas;

    public Libro(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    public Libro() {
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Obra crearLibro(){
        System.out.println("Introduce el título del libro");
        String titulo = sc.nextLine();
        System.out.println("Introduce el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Introduce la duración del libro");
        int paginas = sc.nextInt();
        return new Libro(titulo, autor, paginas);
    }

    @Override
    public String toString() {
        return "Libro["+super.toString()+", "+getPaginas()+" páginas]";
    }
}
