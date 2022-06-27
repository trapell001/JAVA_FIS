package com.example.project_sprint_04.service.Impl;

import com.example.project_sprint_04.entity.Evidence;
import com.example.project_sprint_04.repository.EvidenceRepository;
import com.example.project_sprint_04.service.EvidenciService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EvidenceServiceImpl implements EvidenciService {
    private EvidenceRepository evidenceRepository;
    @Autowired
    public EvidenceServiceImpl(EvidenceRepository evidenceRepository) {
        this.evidenceRepository = evidenceRepository;
    }

    @Override
    public List<Evidence> findAll() {
        return evidenceRepository.findAll();
    }

    @Override
    public Evidence findEvidenceById(Long evidenceId) {
        return evidenceRepository.findById(evidenceId).get();
    }

    @Override
    public Evidence creatEvidence(Evidence evidence) {
        return evidenceRepository.save(evidence);
    }

    @Override
    public void deleteEvidenceById(Long evidenceId) {
        evidenceRepository.deleteById(evidenceId);
    }
}
