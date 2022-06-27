package com.example.project_sprint_03.controller;

import com.example.project_sprint_03.service.CriminalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriminalCaseController {
    private final CriminalCaseService criminalCaseService;
    @Autowired
    public CriminalCaseController(CriminalCaseService criminalCaseService) {
        this.criminalCaseService = criminalCaseService;
    }
}
