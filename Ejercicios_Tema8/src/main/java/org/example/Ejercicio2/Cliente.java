package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public static Scanner sc = new Scanner(System.in);
    public String nombre;
    public int nCliente;


    public Cliente(String nombre, int nCliente) {
        this.nombre = nombre;
        this.nCliente = nCliente;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCliente() {
        return nCliente;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    public Cliente crearCliente(int nCliente){
        System.out.println("Introduce el nombre del cliente");
        // Según copilot este sc es para limpiar el buffer, pero realmente he añadido otro sc.nextLine() porque lo saltaba y no dejaba escribir un valor)
        String nombre = sc.nextLine();
        return new Cliente(nombre, nCliente);
    }

    public Cliente buscarCliente(ArrayList<Cliente> clientes){
        System.out.println("Introduce el n.º de cliente");
        int nCliente = sc.nextInt();
        Cliente cliente = clientes.get(nCliente-1);
        return cliente;
    }

    @Override
    public String toString() {
        return "Cliente[N.º " + getnCliente() + ", " + getNombre() + "]";
    }

}
