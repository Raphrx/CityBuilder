package Models.Buildings;

import java.awt.Color;

public abstract class Building {
    
    protected int buildingLevel = 1;
    protected int[] upgradeCost;
    protected String buildingName;
    protected Color color = Color.BLACK;

    public void upgrade(int moneyOfThePlayer){
        if (moneyOfThePlayer >= upgradeCost[this.buildingLevel]){
            this.buildingLevel += 1;
            System.out.println(buildingName + " Upgraded !");
        }
        else{
            System.out.println(buildingName + " Can't be upgrade !");
        }
    }

    //getter and setter
    public String getBuildingName() {
        return buildingName;
    }
    
}
