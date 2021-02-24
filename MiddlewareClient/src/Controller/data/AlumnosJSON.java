package Controller.data;

import Controller.requestManager.JSONTools;
import Data.dto.Alumno;

public class AlumnosJSON {

    private JSONTools jsonTools = new JSONTools();

    public Alumno JSONToAlumno(String content) {
        return (Alumno) jsonTools.JSONToObject(content, Alumno.class);
    }

    public Alumno[] JSONToAlumnoArray(String content) {
        return (Alumno[]) jsonTools.JSONToObject(content, Alumno[].class);
    }

}
