package com.example.project_sprint_03.entity;
import com.example.project_sprint_03.entity.ultil.CaseStatus;
import com.example.project_sprint_03.entity.ultil.CaseType;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

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
    @Column
    private CaseType type;
    @Column
    private String shortDescription;
    @Column
    private String detailedDescription;
    @Column
    private CaseStatus status;
    @Column
    private String note;
    @Column
    private int leadInvestigatorId;

}
