package Types;

import java.awt.*;

public abstract class Type {
    
    // attributes
    protected String typeName;
    protected String ressources;
    protected Color typeColor;

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
