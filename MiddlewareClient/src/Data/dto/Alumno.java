package Data.dto;

public class Alumno {
    
    private int id;
    private String nombre;
    private int[] calificaciones;

    public Alumno() {
    }

    public Alumno(int id, String nombre, int[] calificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
