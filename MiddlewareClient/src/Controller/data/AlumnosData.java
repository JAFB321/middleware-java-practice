package Controller.data;

import Controller.ClientController;
import Controller.requestManager.RequestSchema;
import Controller.requestManager.RequestType;
import Data.dto.Alumno;

public class AlumnosData {

    private ClientController DataSource;
    private AlumnosJSON alumnosJson = new AlumnosJSON();

    public AlumnosData() {
        DataSource = ClientController.getInstance();
    }

    public Alumno[] getList() {
        Object response = DataSource.sendRequestToServer(RequestSchema.Alumnos, RequestType.LIST, "");
        try {
            //return alumnosJson.JSONToAlumnoArray((String) response);
            return new Alumno[]{new Alumno(1, "Beto", (byte)10), new Alumno(2, "Jose", (byte)21), new Alumno(3, "Juan", (byte)10)};
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Alumno[0];
        }
    }

    public boolean Create(Alumno str) {
        Object response = DataSource.sendRequestToServer(RequestSchema.Alumnos, RequestType.INS, str);
        try {
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Update(Alumno str) {
        Object response = DataSource.sendRequestToServer(RequestSchema.Alumnos, RequestType.INS, str);
        try {
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean Delete(int ID) {
        Object response = DataSource.sendRequestToServer(RequestSchema.Alumnos, RequestType.INS, ID);
        try {
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
