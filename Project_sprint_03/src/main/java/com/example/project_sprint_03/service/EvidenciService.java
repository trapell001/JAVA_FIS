package com.example.project_sprint_03.service;

import com.example.project_sprint_03.entity.Evidence;

import java.util.List;

public interface EvidenciService {
    List<Evidence> findAll();

    Evidence findById(Long evidenceId);

    void save(Evidence evidence);

    void deleteById(Long evidenceId);
}
