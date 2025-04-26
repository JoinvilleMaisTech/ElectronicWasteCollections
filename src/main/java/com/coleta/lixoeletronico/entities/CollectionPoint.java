package com.coleta.lixoeletronico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "collection_points")
public class CollectionPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String collectionDay;

    @OneToMany(mappedBy = "collectionPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CollectionMaterial> materials = new ArrayList<>();

}
