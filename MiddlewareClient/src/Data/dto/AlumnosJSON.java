package Data.dto;

import com.google.gson.*;

public class AlumnosJSON {

    public static String objetoToJSON(Alumno alumno) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(alumno);
    }

    public static Alumno JSONToObjeto(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Alumno.class);
    }
    
    public static void main(String[] args) {
        Alumno wero = new Alumno();
        wero.setId(181331);
        wero.setNombre("Jose Antonio");
        wero.setEdad((byte) 20);
        
        String JSON = objetoToJSON(wero);
        System.out.println(JSON);
        
        Alumno alumnoJSON = JSONToObjeto(JSON);
        System.out.println(alumnoJSON.getId());
        System.out.println(alumnoJSON.getNombre());
        System.out.println(alumnoJSON.getEdad());
    }
    
}