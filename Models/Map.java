package Models;
import java.util.ArrayList;

public class Map {
    
    private ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>();
    private int mapLength = 5;
    public Map(){

        // initialisation of the cells
        for (int i = 0; i < mapLength; i++) {
            cells.add(new ArrayList<Cell>());
            for (int j = 0; j < mapLength; j++) {
                cells.get(i).add(new Cell());
            }      
        }
    }

    //Methods
    public Cell getCell(int posX, int posY){

        Cell currentCell = cells.get(posX).get(posY);
        return currentCell;
    }

    //geters and seters

    public int getMapLength() {
        return mapLength;
    }

    public void setMapLength(int mapLength) {
        this.mapLength = mapLength;
    }



}
