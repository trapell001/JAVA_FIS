package com.example.project_sprint_03.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

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
    private int archived;
    @Column
    private int criminalCaseId;
    @Column
    private int storageId;
}
