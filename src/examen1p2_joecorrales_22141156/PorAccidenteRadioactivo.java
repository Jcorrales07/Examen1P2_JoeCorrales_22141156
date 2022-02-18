package examen1p2_joecorrales_22141156;

public class PorAccidenteRadioactivo extends Persona {
    protected int edadAlMomentoAccidente;
    protected String tipoAccidente;

    public PorAccidenteRadioactivo() {}

    public PorAccidenteRadioactivo(String nombre, String poder, String debilidad, String tipoPersonaje,
            int fuerza, int habilidadmental, int habilidadFisica, boolean tieneEscuadron, int edadAlMomentoAccidente, String tipoAccidente) {
        super(nombre, poder, debilidad, tipoPersonaje, fuerza, habilidadmental, habilidadFisica, tieneEscuadron);
        this.edadAlMomentoAccidente = edadAlMomentoAccidente;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAlMomentoAccidente() {
        return edadAlMomentoAccidente;
    }

    public void setEdadAlMomentoAccidente(int edadAlMomentoAccidente) {
        this.edadAlMomentoAccidente = edadAlMomentoAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PorAccidenteRadioactivo { \nEdad Al Momento de Accidente = ").append(edadAlMomentoAccidente);
        sb.append(", \nTipo Accidente = ").append(tipoAccidente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    void findChance(Persona p1, Persona p2) {
        
    }
}
