package Controller.data;

import Controller.ClientController;
import Data.dto.Alumno;

public class AlumnosData {

    private ClientController DataSource;
    private AlumnosJSON alumnosJson = new AlumnosJSON();

    public AlumnosData() {
        DataSource = ClientController.getInstance();
    }

    public Alumno GetCalificaciones(String ID) {
        Object response = DataSource.sendRequestToServer(ID);
        
        try {
            return alumnosJson.JSONToAlumno(response.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
