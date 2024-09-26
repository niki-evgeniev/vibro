package vibro.vibro.Models.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "descriptions", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "thickness", nullable = false)
    private Double thickness;

    @Column(name = "size-a", nullable = false)
    private Double sizeA;

    @Column(name = "size-b", nullable = false)
    private Double sizeB;

    @Column(name = "lostHz", nullable = false)
    private Double lostHz;

    @Column(name = "lost", nullable = false)
    private Double lost;

    @ManyToOne
    private User user;

    public Product() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getThickness() {
        return thickness;
    }

    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSizeA() {
        return sizeA;
    }

    public void setSizeA(Double sizeA) {
        this.sizeA = sizeA;
    }

    public Double getSizeB() {
        return sizeB;
    }

    public void setSizeB(Double sizeB) {
        this.sizeB = sizeB;
    }

    public Double getLostHz() {
        return lostHz;
    }

    public void setLostHz(Double lostHz) {
        this.lostHz = lostHz;
    }

    public Double getLost() {
        return lost;
    }

    public void setLost(Double lost) {
        this.lost = lost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
