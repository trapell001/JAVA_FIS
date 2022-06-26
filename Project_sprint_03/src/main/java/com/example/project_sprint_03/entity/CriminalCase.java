package com.example.project_sprint_03.entity;
import com.example.project_sprint_03.entity.ultil.CaseStatus;
import com.example.project_sprint_03.entity.ultil.CaseType;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class CriminalCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int version;
    @Column
    private LocalDate created_at;
    @Column
    private String number;
    @Enumerated(EnumType.STRING)
    private CaseType type;
    @Column
    private String shortDescription;
    @Column
    private String detailedDescription;
    @Enumerated(EnumType.STRING)
    private CaseStatus status;
    @Column
    private String note;
    @ManyToOne
    @JoinColumn()
    private Detective leadInvestigatorId;
    @OneToMany(mappedBy = "evidence")
    private Set<Evidence> evidences = new HashSet<>();
}
