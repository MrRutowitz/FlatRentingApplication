package pl.flatmanagement.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long prize;
    private Date rentalPeriod;

    @ManyToOne
    private Tenant tenant;
    @ManyToOne
    private Flat flat;

    public Details() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrize() {
        return prize;
    }

    public void setPrize(Long prize) {
        this.prize = prize;
    }

    public Date getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(Date rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }
}
