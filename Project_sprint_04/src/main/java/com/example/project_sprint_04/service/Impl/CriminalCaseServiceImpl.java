package com.example.project_sprint_04.service.Impl;

import com.example.project_sprint_04.entity.CriminalCase;
import com.example.project_sprint_04.repository.CriminalCaseRepository;
import com.example.project_sprint_04.service.CriminalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public CriminalCase createCriminalCase(CriminalCase criminalCase) {
        return criminalCaseRepository.save(criminalCase);
    }

    @Override
    public CriminalCase updateCriminalCase(CriminalCase criminalCase) {
        return criminalCaseRepository.save(criminalCase);
    }

    @Override
    public void deleteCriminaCaseById(Long criminalCaseId) {
        criminalCaseRepository.deleteById(criminalCaseId);
    }
}
