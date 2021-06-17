package Types;

import java.awt.*;

public abstract class Type {
    
    // attributes
    private String typeName;
    private String ressources;
    private Color typeColor;

    // methods

    
    // Geters and seters

    public String getTypeName() {
        return typeName;
    }

    public String getRessources() {
        return ressources;
    }

    public void setRessources(String ressources) {
        this.ressources = ressources;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setTypeColor(Color typeColor) {
        this.typeColor = typeColor;
    }

    public Color getTypeColor() {
        return typeColor;
    }



}
