package vibro.vibro.Models;

import java.util.UUID;

public class ProductsAllDTO {

    private UUID id;

    private String name;

    private String description;

    private String imagePath;

    private String lost;

    private String lostHz;

    private String sizeA;

    private String sizeB;

    private String thickness;

    public ProductsAllDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getLost() {
        return lost;
    }

    public void setLost(String lost) {
        this.lost = lost;
    }

    public String getLostHz() {
        return lostHz;
    }

    public void setLostHz(String lostHz) {
        this.lostHz = lostHz;
    }

    public String getSizeA() {
        return sizeA;
    }

    public void setSizeA(String sizeA) {
        this.sizeA = sizeA;
    }

    public String getSizeB() {
        return sizeB;
    }

    public void setSizeB(String sizeB) {
        this.sizeB = sizeB;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }
}
