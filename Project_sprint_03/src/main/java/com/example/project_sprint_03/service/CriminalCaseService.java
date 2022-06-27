package com.example.project_sprint_03.service;

import com.example.project_sprint_03.entity.CriminalCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CriminalCaseService {
    List<CriminalCase> findAll();
    CriminalCase findCriminalCaseById(Long criminalCaseId);
    CriminalCase createCriminalCase(CriminalCase criminalCase);
    CriminalCase updateCriminalCase(CriminalCase criminalCase);
    void deleteCriminaCaseById(Long criminalCaseId);
}
