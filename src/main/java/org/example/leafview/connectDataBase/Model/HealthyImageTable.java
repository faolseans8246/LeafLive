package org.example.leafview.connectDataBase.Model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "healthyLeafImages")
public class HealthyImageTable implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CollectionTable(name = "Sog'lom barg ID")
    private long id;

    @Column(name = "Sog'lom barg nomi")
    private String healthy_leaf_name;

    @Column(name = "Sog'lom barg manzili")
    private String healthy_leaf_path_leaf;

    @Column(name = "Sog'lom barg hajmi")
    private long size_healthy_leaf;

}
