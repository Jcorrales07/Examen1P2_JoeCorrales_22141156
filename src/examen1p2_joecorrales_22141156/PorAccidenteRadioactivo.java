package examen1p2_joecorrales_22141156;

public class PorAccidenteRadioactivo extends Persona {
    protected int edadAlMomentoAccidente;
    protected String tipoAccidente;

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
        sb.append("PorAccidenteRadioactivo{edadAlMomentoAccidente=").append(edadAlMomentoAccidente);
        sb.append(", tipoAccidente=").append(tipoAccidente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    void findChance(Persona p1, Persona p2) {
        
    }
}
