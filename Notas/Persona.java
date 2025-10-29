package Notas;

public class Persona {
    protected String nombre;
    protected String programa;

    public Persona(String nombre, String programa) {
        this.nombre = nombre;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}