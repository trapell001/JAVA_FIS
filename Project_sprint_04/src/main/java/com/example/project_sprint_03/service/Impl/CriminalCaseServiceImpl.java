package com.example.project_sprint_03.service.Impl;

import com.example.project_sprint_03.entity.CriminalCase;
import com.example.project_sprint_03.entity.Evidence;
import com.example.project_sprint_03.repository.CriminalCaseRepository;
import com.example.project_sprint_03.repository.EvidenceRepository;
import com.example.project_sprint_03.service.CriminalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CriminalCaseServiceImpl implements CriminalCaseService{
    private CriminalCaseRepository criminalCaseRepository;
    @Autowired
    public CriminalCaseServiceImpl(CriminalCaseRepository criminalCaseRepository) {
        this.criminalCaseRepository = criminalCaseRepository;
    }

    @Override
    public List<CriminalCase> findAll() {
        return criminalCaseRepository.findAll();
    }

    @Override
    public CriminalCase findCriminalCaseById(Long criminalCaseId) {
        return criminalCaseRepository.findById(criminalCaseId).get();
    }

    @Override
    public void createCriminalCase(CriminalCase criminalCase) {
        criminalCaseRepository.save(criminalCase);
    }

    @Override
    public void updateCriminalCase(CriminalCase criminalCase) {
        findCriminalCaseById(criminalCase.getId()).
    }

    @Override
    public void deleteCriminaCaseById(Long criminalCaseId) {
        criminalCaseRepository.deleteById(criminalCaseId);
    }
}
