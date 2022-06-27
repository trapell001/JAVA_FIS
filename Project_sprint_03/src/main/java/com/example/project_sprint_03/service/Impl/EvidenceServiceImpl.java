package com.example.project_sprint_03.service.Impl;

import com.example.project_sprint_03.entity.Evidence;
import com.example.project_sprint_03.repository.EvidenceRepository;
import com.example.project_sprint_03.service.EvidenciService;
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
    public Evidence findById(Long evidenceId) {
        return evidenceRepository.findById(evidenceId).get();
    }

    @Override
    public void save(Evidence evidence) {
        evidenceRepository.save(evidence);
    }

    @Override
    public void deleteById(Long evidenceId) {
        evidenceRepository.deleteById(evidenceId);
    }
}
