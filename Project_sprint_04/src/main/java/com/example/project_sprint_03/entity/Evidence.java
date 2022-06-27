package com.example.project_sprint_03.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

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
    @ManyToOne
    @JoinColumn(name = "criminal_case_id")
    private CriminalCase criminalCase;

    @ManyToOne
    @JoinColumn(name = "storage_id")
    private Storage storage;
    @OneToMany(mappedBy = "evidence")
    private Set<TrackEntry> trackEntries;
}
