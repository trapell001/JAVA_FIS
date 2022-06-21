package com.example.project_sprint_03.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Detective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int version;

}
