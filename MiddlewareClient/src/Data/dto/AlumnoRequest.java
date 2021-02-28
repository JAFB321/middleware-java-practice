
package Data.dto;

public class AlumnoRequest {
    public final String ID;
    public final Alumno Content;

    public AlumnoRequest(String ID, Alumno content) {
        this.ID = ID;
        this.Content = content;
    }
}
