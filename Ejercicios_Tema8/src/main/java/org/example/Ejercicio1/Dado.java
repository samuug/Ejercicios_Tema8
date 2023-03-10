package org.example.Ejercicio1;

public class Dado {
        public int numeroCaras;
        public int ultimaCara;

        public Dado(int numeroCaras) {
            this.numeroCaras = numeroCaras;
        }
        public Dado(){
            this.numeroCaras = 6;
        }

        public int getNumeroCaras() {
            return numeroCaras;
        }

        public int getUltimaCara() {
            return ultimaCara;
        }

        public void setNumeroCaras(int numeroCaras) {
            this.numeroCaras = numeroCaras;
        }

        public int lanzarDado(){
            this.ultimaCara = (int) (Math.random() * numeroCaras) + 1;
            return ultimaCara;
        }
}
