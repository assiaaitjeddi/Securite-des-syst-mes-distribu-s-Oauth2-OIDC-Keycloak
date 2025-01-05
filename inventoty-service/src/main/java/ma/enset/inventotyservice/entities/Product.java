package ma.enset.inventotyservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity @AllArgsConstructor @NoArgsConstructor @Builder @ToString @Setter @Getter
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;

}
