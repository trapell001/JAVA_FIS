package com.example.project_sprint_03.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
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
}
