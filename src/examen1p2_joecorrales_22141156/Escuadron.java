package examen1p2_joecorrales_22141156;

import java.util.ArrayList;

public class Escuadron {
    protected String nombre;
    protected String lugarBase;
    protected String tipoPersonaje;
    ArrayList<Persona> miembros;

    public Escuadron(String nombre, String lugarBase, String tipoPersonaje) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.tipoPersonaje = tipoPersonaje;
        this.miembros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escuadron { \nNombre = ").append(nombre);
        sb.append(", \nLugar Base = ").append(lugarBase);
        sb.append(", \nTipo Personaje = ").append(tipoPersonaje);
        sb.append(", \nMiembros = ").append(miembros);
        sb.append("\n}");
        return sb.toString();
    }
}
