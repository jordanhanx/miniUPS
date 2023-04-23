package edu.duke.ece568.sp.miniups.model;
import edu.duke.ece568.sp.miniups.model.myenum.TruckStatus;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "truck")
public class Truck {

    @Id
    @SequenceGenerator(
            name = "truck_sequence",
            sequenceName = "truck_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "truck_sequence"
    )
    @Column(name = "truck_id")
    private Long truckID;

    @Column(name = "real_x", nullable = false)
    private Integer realX;

    @Column(name = "real_y", nullable = false)
    private Integer realY;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TruckStatus status;

    public Truck() {
    }

    public Truck(Integer realX, Integer realY, TruckStatus status) {
        this.realX = realX;
        this.realY = realY;
        this.status = status;
    }


    public Long getTruckID() {
        return truckID;
    }

    public Integer getRealX() {
        return realX;
    }

    public Integer getRealY() {
        return realY;
    }

    public TruckStatus getStatus() {
        return status;
    }
}