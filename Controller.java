import UIClass.GUI;

public class Controller {
    
    public static void main(String[] args) {
        
        GUI gui = new GUI();

        gui.getMapGui().getMap().getCell(0, 0).build("Farm");
        gui.getMapGui().paintMap();
        
    }
}
