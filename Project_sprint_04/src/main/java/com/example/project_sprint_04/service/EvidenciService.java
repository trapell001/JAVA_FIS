package com.example.project_sprint_04.service;

import com.example.project_sprint_04.entity.Evidence;

import java.util.List;

public interface EvidenciService {
    List<Evidence> findAll();
    Evidence findEvidenceById(Long evidenceId);
    Evidence creatEvidence(Evidence evidence);
    void deleteEvidenceById(Long evidenceId);
}
