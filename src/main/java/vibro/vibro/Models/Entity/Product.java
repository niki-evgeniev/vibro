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
    private Integer thickness;

    @Column(name = "sizeA", nullable = false)
    private Integer sizeA;

    @Column(name = "sizeB", nullable = false)
    private Integer sizeB;

    @Column(name = "lostHz", nullable = false)
    private Integer lostHz;

    @Column(name = "lost", nullable = false)
    private Integer lost;

    @ManyToOne
    private User user;

    public Product() {
    }

    public Integer getThickness() {
        return thickness;
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

    public void setThickness(Integer thickness) {
        this.thickness = thickness;
    }

    public Integer getSizeA() {
        return sizeA;
    }

    public void setSizeA(Integer sizeA) {
        this.sizeA = sizeA;
    }

    public Integer getSizeB() {
        return sizeB;
    }

    public void setSizeB(Integer sizeB) {
        this.sizeB = sizeB;
    }

    public Integer getLostHz() {
        return lostHz;
    }

    public void setLostHz(Integer lostHz) {
        this.lostHz = lostHz;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
