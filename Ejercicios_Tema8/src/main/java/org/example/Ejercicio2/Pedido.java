package org.example.Ejercicio2;

public class Pedido {
    public Cliente cliente;
    public Obra obra;



    public Pedido(Cliente cliente, Obra obra) {
        this.cliente = cliente;
        this.obra = obra;
    }

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Pedido crearPedido(Cliente cliente, Obra obra){
        return new Pedido(cliente, obra);
    }
}
