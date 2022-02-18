package examen1p2_joecorrales_22141156;

public class Deidad extends Extraterreste {
    protected boolean tieneCreyentes;
    protected String religionMitologica;

    public Deidad() {}

    public Deidad(String nombre, String poder, String debilidad, String tipoPersonaje, int fuerza, int habilidadmental,
            int habilidadFisica, boolean tieneCreyentes, String religionMitologica) {
        super(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica);
        this.tieneCreyentes = tieneCreyentes;
        this.religionMitologica = religionMitologica;
    }

    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getReligionMitologica() {
        return religionMitologica;
    }

    public void setReligionMitologica(String religionMitologica) {
        this.religionMitologica = religionMitologica;
    }
    
    @Override
    void findChance(Persona p1, Persona p2) {
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());    
        sb.append("Deidad { \ntieneCreyentes = ").append(tieneCreyentes);
        sb.append(", \nReligion Mitologica = ").append(religionMitologica);
        sb.append("\n}");
        return sb.toString();
    }
}
