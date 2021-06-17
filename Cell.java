import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Random;
import java.util.Random.*;

import Types.*;
//import Buildings.*;

public class Cell {
    
    private Type type;
    private String[] ListOfTypes = {"Plains"};
    public Cell(){

        randomType();
    }

    //Methods
    public void randomType(){
        Random r = new Random();
        int randomNumber = r.nextInt(ListOfTypes.length + 1);

        switch (randomNumber) {
            case 0:
                this.type = new Plains();
                break;
            case 1:
                this.type = new Desert();
                break;
            
            default:
                break;
        }
    }
    //geters and seters 
    public Type getType() {
        return type;
    }

}
