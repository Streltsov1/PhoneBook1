package org.example.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbl_product_images")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    private int priority;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    private boolean isDelete;

    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;

}
