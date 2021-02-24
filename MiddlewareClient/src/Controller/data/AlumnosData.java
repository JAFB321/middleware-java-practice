
package Controller.data;

import Controller.ClientController;
import Data.dto.Alumno;


public class AlumnosData {
    
    private ClientController DataSource;

    public AlumnosData() {
        DataSource = ClientController.getInstance();
    }
    
    public Alumno[] getList(){
        
    }
    
    public boolean Create(Alumno str){
        
    }
    
    public boolean Update(Alumno str){
        
    }
    
    public boolean Delete(int ID){
        
    }
    
}
