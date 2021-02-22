
package Data;

import Data.dto.strAlumno;
import java.util.ArrayList;


public class Database {
    public ArrayList<strAlumno> DATA;
    
    public Database(){
        DATA = new ArrayList<strAlumno>();
        DATA.add(new strAlumno(1, "Jose Antonio Felix Ballesteros", 9, 20));
        DATA.add(new strAlumno(2, "Jose Pablo Coronado Ramon", 10, 22));
        DATA.add(new strAlumno(3, "Bruno Ernesto Gil Morales", 9, 21));
        DATA.add(new strAlumno(4, "Alberto Felix Rosas", 9, 22));        
    }
    
    public strAlumno[] getList(String Filter){
        ArrayList<strAlumno> list = new ArrayList<>();
        
        for (strAlumno a : DATA) {
            if(a.Nombre.toLowerCase().contains(Filter.toLowerCase())){
                list.add(a);
            }
        }
        
        return list.toArray(new strAlumno[0]);
    }
    
    public boolean Add(strAlumno str){
        str.ID  = DATA.get(DATA.size() -1).ID + 1;
        DATA.add(str);
        return true;
    }
    
    public boolean Update(strAlumno str){
        for (int i = 0; i<DATA.size(); i++) {
            if(DATA.get(i).ID == str.ID){
                DATA.set(i, str);
            }
        }
        return true;
    }
    
    public boolean Delete(int ID){
        for (int i = 0; i<DATA.size(); i++) {
            if(DATA.get(i).ID == ID){
                DATA.remove(i);
            }
        }
        return true;
    }
    
}
