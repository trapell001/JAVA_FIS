package com.example.project_sprint_04.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Storage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int version;
    @Column
    private LocalDate created_at;
    @Column
    private String name;
    @Column
    private String location;
    @OneToMany(mappedBy = "storage")
    private Set<Evidence> evidences;
}
