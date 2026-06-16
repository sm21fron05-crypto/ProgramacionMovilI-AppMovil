package ronnae.com.bo.tema5_prueba_significativa_final;

import java.io.Serializable;

public class ItemModel implements Serializable {
    private final int id;
    private final String name;
    private final String origin;
    private final String category;
    private final String description;
    private final int drawableId;
    private final String power;
    private final String habitat;
    private final String weakness;

    public ItemModel(int id, String name, String origin, String category, String description, int drawableId, String power, String habitat, String weakness) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.category = category;
        this.description = description;
        this.drawableId = drawableId;
        this.power = power;
        this.habitat = habitat;
        this.weakness = weakness;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public String getPower() {
        return power;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getWeakness() {
        return weakness;
    }
}
