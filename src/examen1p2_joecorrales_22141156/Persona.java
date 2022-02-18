package examen1p2_joecorrales_22141156;

public abstract class Persona {
    protected String nombre;
    protected String poder;
    protected String debilidad;
    protected String tipoPersonaje;
    protected int fuerza;
    protected int habilidadmental;
    protected int habilidadFisica;
    protected boolean tieneEscuadron;

    public Persona() {}
    
    public Persona(String nombre, String poder, String debilidad, String tipoPersonaje, int fuerza, int habilidadmental, int habilidadFisica, boolean tieneEscuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.tipoPersonaje = tipoPersonaje;
        this.fuerza = fuerza;
        this.habilidadmental = habilidadmental;
        this.habilidadFisica = habilidadFisica;
        this.tieneEscuadron = tieneEscuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadmental() {
        return habilidadmental;
    }

    public void setHabilidadmental(int habilidadmental) {
        this.habilidadmental = habilidadmental;
    }

    public int getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }
    
    abstract void findChance(Persona p1, Persona p2);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona { \nNombre = ").append(nombre);
        sb.append(", \nPoder = ").append(poder);
        sb.append(", \nDebilidad = ").append(debilidad);
        sb.append(", \nTipo Personaje = ").append(tipoPersonaje);
        sb.append(", \nFuerza = ").append(fuerza);
        sb.append(", \nHabilidad Mental = ").append(habilidadmental);
        sb.append(", \nHabilidad Fisica = ").append(habilidadFisica);
        sb.append(", \nTiene Escuadron = ").append(tieneEscuadron);
        sb.append("\n}");
        return sb.toString();
    }
}
