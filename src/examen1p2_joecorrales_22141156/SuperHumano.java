package examen1p2_joecorrales_22141156;

public class SuperHumano extends Persona {
    protected String superPoder;
    
    
    public SuperHumano() {}

    public SuperHumano(String nombre, String poder, String debilidad, String tipoPersonaje,
            int fuerza, int habilidadmental, int habilidadFisica, String superPoder) {
        super(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
        this.superPoder = superPoder;
    }
    
    @Override
    void findChance(Persona p1, Persona p2) {

    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("SuperHumano{ \nSuper Poder=").append(superPoder);
        sb.append('}');
        return sb.toString();
    }
}
