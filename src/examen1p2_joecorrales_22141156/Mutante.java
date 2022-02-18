package examen1p2_joecorrales_22141156;

import java.util.ArrayList;

public class Mutante extends Persona {
    public ArrayList<String> factoresMutantes;

    public Mutante() {}

    public Mutante(String nombre, String poder, String debilidad, String tipoPersonaje, int fuerza, int habilidadmental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica, tieneEscuadron);
        factoresMutantes = new ArrayList<>();
    }

    @Override
    void findChance(Persona p1, Persona p2) {

    }
}
