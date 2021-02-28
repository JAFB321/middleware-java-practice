
package Data;

import Data.dto.Alumno;
import java.util.ArrayList;


public class Database {
    public ArrayList<Alumno> DATA;
    
    public Database(){
        DATA = new ArrayList<Alumno>();
        DATA.add(new Alumno(1, "Jose Antonio Felix Ballesteros", new int[]{9,8,7,8}));
        DATA.add(new Alumno(2, "Jose Pablo Coronado Ramon", new int[]{9,10,5,8}));
        DATA.add(new Alumno(3, "Bruno Ernesto Gil Morales", new int[]{10,8,9,10}));
        DATA.add(new Alumno(4, "Alberto Felix Rosas", new int[]{9,9,7,10}));        
    }
    
    public Alumno getAlumnos(int ID){
        
        for (Alumno a : DATA) {
            if(a.getId() == ID){
                return a;
            }
        }
        
        return null;
    }
    
    
}
