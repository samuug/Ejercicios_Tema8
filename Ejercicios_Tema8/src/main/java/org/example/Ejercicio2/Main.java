package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void menu(){
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        ArrayList<Obra> obras = new ArrayList<>();
        boolean salir = false;
        int contadorC = 1;
        int contadorP = 1;
        int contadorO = 1;
        do {
            System.out.println("-- Menu --");
            System.out.println("1.- Mostrar clientes");
            System.out.println("2.- Crear cliente");
            System.out.println("3.- Crear una obra");
            System.out.println("4.- Crear un pedido");
            System.out.println("5.- Mostrar pedidos");
            System.out.println("6.- Salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("-- Clientes --");
                    clientes.forEach(System.out::println);
                    break;
                case 2:
                    clientes.add(new Cliente().crearCliente(contadorC));
                    System.out.println("Cliente n.º " + contadorC+" [" + clientes.get(contadorC-1).getNombre() +"] añadido");
                    contadorC++;
                    break;
                case 3:
                    System.out.println("Introduce el tipo de obra:");
                    System.out.println("1.- Libro");
                    System.out.println("2.- Video");
                    int tipo = sc.nextInt();
                    switch (tipo){
                        case 1:
                            obras.add(new Libro().crearLibro());
                            System.out.println("Libro [" + obras.get(contadorO-1).getTitulo() +"] añadido");
                            break;
                        case 2:
                            obras.add(new Video().crearVideo());
                            System.out.println("Video [" + obras.get(contadorO-1).getTitulo() +"] añadido");
                            break;
                    }
                    break;
                case 4:
                    new Pedido().crearPedido(new Cliente().buscarCliente(clientes), new Obra().buscarObra(obras));
                    System.out.println("Pedido n.º " + contadorP + " añadido");
                    break;
                case 5:
                    System.out.println("-- Pedidos --");
                    pedidos.forEach(System.out::println);
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (!salir);
    }

    public static void main(String[] args) {
        menu();
    }
}
