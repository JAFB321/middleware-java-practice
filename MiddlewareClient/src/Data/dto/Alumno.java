package Data.dto;

public class Alumno {
    
    private int id;
    private String nombre;
    private byte edad;

    public Alumno(int id, String nombre, byte edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    public Alumno() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    
}
