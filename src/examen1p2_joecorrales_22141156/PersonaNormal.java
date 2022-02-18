package examen1p2_joecorrales_22141156;

public class PersonaNormal extends Persona {

    public PersonaNormal() {}

    public PersonaNormal(String nombre, String poder, String debilidad, String tipoPersonaje, int fuerza, int habilidadmental, int habilidadFisica) {
        super(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
    }
    
    @Override
    void findChance(Persona p1, Persona p2) {
        
    }
}
