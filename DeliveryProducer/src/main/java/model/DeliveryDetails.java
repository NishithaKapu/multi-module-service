package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DeliveryDetails {
    @Id
    private Long id;
    private String geoLocation;
    private String eventType;
    private String sender;
    private String receiver;
    private Date estimatedDeliveryDate;
    private Date eventCreatedDate;
    private String pickUpLocation;
    private String dropLocation;

}
