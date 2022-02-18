package examen1p2_joecorrales_22141156;

import java.util.ArrayList;

public class Universo {
    protected String nombre;
    ArrayList<Escuadron> squads;

    public Universo(String nombre, ArrayList<Escuadron> squads) {
        this.nombre = nombre;
        this.squads = squads;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Escuadron> squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Universo { \nNombre = ").append(nombre);
        sb.append(", \nSquads = ").append(squads);
        sb.append("\n}");
        return sb.toString();
    }
}
