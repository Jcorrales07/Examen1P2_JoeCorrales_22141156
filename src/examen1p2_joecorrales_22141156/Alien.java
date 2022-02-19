package examen1p2_joecorrales_22141156;

public class Alien extends Extraterreste {
    protected String planeta;

    public Alien() {}

    public Alien(String planeta, String nombre, String poder, String debilidad,
            String tipoPersonaje, int fuerza, int habilidadmental, int habilidadFisica) {
        super(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    @Override
    void findChance(Persona p1, Persona p2) {
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Alien { \nPlaneta=").append(planeta);
        sb.append("\n}");
        return sb.toString();
    }
}
