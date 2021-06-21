package Models;

public class Player {
   
    private String name;
    private int money;

    public Player(){

        this.money = 50;
        
    }

    // seters and geters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

}
