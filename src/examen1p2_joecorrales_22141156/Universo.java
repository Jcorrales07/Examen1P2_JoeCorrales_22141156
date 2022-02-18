package examen1p2_joecorrales_22141156;

import java.util.ArrayList;

public class Universo {
    protected String nombre;
    ArrayList<Escuadron> escuadron;

    public Universo(String nombre) {
        this.nombre = nombre;
        escuadron = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getnEscuadron() {
        return escuadron;
    }

    public void setEscuadron(ArrayList<Escuadron> escuadron) {
        this.escuadron = escuadron;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Universo { \nNombre = ").append(nombre);
        sb.append(", \nEscuadrones = ").append(escuadron.size());
        sb.append("\n}");
        return sb.toString();
    }
}
