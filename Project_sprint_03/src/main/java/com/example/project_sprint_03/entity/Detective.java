package com.example.project_sprint_03.entity;
import com.example.project_sprint_03.entity.ultil.CaseStatus;
import com.example.project_sprint_03.entity.ultil.Rank;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Detective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int version;
    @Column
    private LocalDateTime modifiedAt;
    @Column
    private String username;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String password;
    @Column
    private LocalDateTime hiringDate;
    @Column
    private String badgeNumber;
    @Enumerated(EnumType.STRING)
    private Rank rankOfDetective;
    @Column
    private int armed;
    @Enumerated(EnumType.STRING)
    private CaseStatus status;
    
}
