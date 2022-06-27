package com.example.project_sprint_04.controller;

import com.example.project_sprint_04.entity.CriminalCase;
import com.example.project_sprint_04.repository.CriminalCaseRepository;
import com.example.project_sprint_04.service.CriminalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/criminal")
public class CriminalCaseController {
    private final CriminalCaseService criminalCaseService;
    @Autowired
    public CriminalCaseController(CriminalCaseService criminalCaseService) {
        this.criminalCaseService = criminalCaseService;
    }
    @GetMapping("/")
    public ResponseEntity<List<CriminalCase>> findAll(){
        List<CriminalCase> criminalCases = criminalCaseService.findAll();
        return new ResponseEntity<>(criminalCases, HttpStatus.OK);
    }
    @PostMapping("/creat")
    public ResponseEntity<CriminalCase> creatCriminalCase(@RequestBody CriminalCase criminalCase){
        criminalCaseService.createCriminalCase(criminalCase);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @PostMapping("/update")
    public ResponseEntity<CriminalCase> updateCriminalCase(@RequestBody CriminalCase criminalCase){
        criminalCaseService.updateCriminalCase(criminalCase);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<CriminalCase> findCriminalById(@PathVariable Long id){
        CriminalCase criminalCase = criminalCaseService.findCriminalCaseById(id);
        return new ResponseEntity<>(criminalCase,HttpStatus.OK);
    }
    @PostMapping("/delete/{id}")
    public ResponseEntity<CriminalCase> deleteCriminal(@PathVariable Long id){
        criminalCaseService.deleteCriminaCaseById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
