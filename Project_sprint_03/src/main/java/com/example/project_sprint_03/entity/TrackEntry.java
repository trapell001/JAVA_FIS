package com.example.project_sprint_03.entity;

import com.example.project_sprint_03.entity.ultil.TrackAciton;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class TrackEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int version;
    @Column
    private LocalDate created_at;
    @Enumerated(EnumType.STRING)
    private TrackAciton action;
    @Column
    private String reason;

}
