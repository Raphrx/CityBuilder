package UIClass;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame{
    
    public MapGui mapgui;
    public GUI(){

        // Panel maître
        this.setSize(new Dimension(1200, 800));
        JPanel windowPanel = new JPanel(new BorderLayout());
        this.add(windowPanel);

        //Panel menu west
        JPanel panelMenu = new JPanel(new GridLayout());
        windowPanel.add(panelMenu, BorderLayout.WEST);

        //Panel centre
        JPanel panelMilieu = new JPanel(new GridLayout());
        this.mapgui = new MapGui();
        panelMilieu.add(this.mapgui);
        windowPanel.add(panelMilieu, BorderLayout.CENTER);

        // bottom
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public MapGui getMapGui(){
        return this.mapgui;
    }
}
