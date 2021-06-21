package Models;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Random;
import java.util.Random.*;

import Models.Buildings.*;
import Models.Types.*;

public class Cell {
    
    private Type type;
    private String[] ListOfTypes = {"Plains", "Desert", "Forest", "Montains", "Ocean"};
    private Building buildingOnCell;
    public Cell(){

        randomType();
        this.buildingOnCell = new EmptyBuilding();
    }

    //Methods
    public void randomType(){
        Random r = new Random();
        int randomNumber = r.nextInt(ListOfTypes.length);

        switch (randomNumber) {
            case 0:
                this.type = new Plains();
                break;
            case 1:
                this.type = new Desert();
                break;
            case 2:
                this.type = new Forest();
                break;
            case 3:
                this.type = new Montains();
                break;
            case 4:
                this.type = new Ocean();
                break;
            default:
                break;
        }
    }

    public void destroyArea(){

    }

    public void build(String nameOfTheBuilding){
        switch (nameOfTheBuilding) {
            case "Farm":
                this.buildingOnCell = new Farm();
                break;
            case "Empty":
                this.buildingOnCell = new EmptyBuilding();
                break;
            default:
                break;
        }
    }

    public boolean isBuildingOnCell(){
        if(this.buildingOnCell.getBuildingName() == "Empty"){
            return false;
        }
        else{
            return true;
        }
    }
    //geters and seters 
    public Type getType() {
        return type;
    }

}
