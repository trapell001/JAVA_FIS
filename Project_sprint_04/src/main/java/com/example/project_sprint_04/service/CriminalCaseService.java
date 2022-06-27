package com.example.project_sprint_04.service;

import com.example.project_sprint_04.entity.CriminalCase;

import java.util.List;

public interface CriminalCaseService {
    List<CriminalCase> findAll();
    CriminalCase findCriminalCaseById(Long criminalCaseId);
    CriminalCase createCriminalCase(CriminalCase criminalCase);
    CriminalCase updateCriminalCase(CriminalCase criminalCase);
    void deleteCriminaCaseById(Long criminalCaseId);
}
