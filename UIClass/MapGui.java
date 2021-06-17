package UIClass;
import javax.swing.*;

import ;

import java.awt.*;
import java.util.ArrayList;

public class MapGui extends JPanel{
    
    private Map map;
    private int mapLength;
    private ArrayList<ArrayList<SlotButton>> array_of_SlotButton = new ArrayList<ArrayList<SlotButton>>();
    public MapGui(){

        this.map = new Map();
        int mapLength = this.map.getMapLength();
        this.mapLength = mapLength;
        JPanel mapPanel = new JPanel(new GridLayout(mapLength, mapLength));
        this.add(mapPanel);

        // For debug
        for (int i = 0; i < mapLength; i++) {
            array_of_SlotButton.add(new ArrayList<SlotButton>());
            for (int j = 0; j < mapLength; j++) {
                array_of_SlotButton.get(i).add(new SlotButton());
                mapPanel.add(array_of_SlotButton.get(i).get(j));
            }
        }
        paintMap();
    }

    public void paintMap(){
        for (int i = 0; i < this.mapLength; i++) {
            for (int j = 0; j < this.mapLength; j++) {
                Color color = this.map.getCell(i, j).getType().getTypeColor();
                array_of_SlotButton.get(i).get(j).setBackground(color);
            }
        }
    }
}
