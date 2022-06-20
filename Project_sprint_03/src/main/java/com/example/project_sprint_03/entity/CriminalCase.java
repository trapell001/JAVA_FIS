package com.example.project_sprint_03.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class CriminalCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int version;

}
