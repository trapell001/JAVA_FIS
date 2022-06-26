package com.example.project_sprint_03.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class Evidence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int version;
    @Column
    private LocalDate created_at;
    @Column
    private String number;
    @Column
    private String itemName;
    @Column
    private String note;
    @Column
    private boolean archived;
    @Column
    private int criminalCaseId;
    @Column
    private int storageId;
}
