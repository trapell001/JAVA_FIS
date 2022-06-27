package com.example.project_sprint_04.service;

import com.example.project_sprint_04.entity.Detective;

import java.util.List;

public interface DetectiveService {
    List<Detective> findAll();
    Detective findDetectiveById(Long detectiveId);
    Detective createDetective(Detective detective);
    Detective updateDetective(Detective detective);
    void deleteDetectiveById(Long detectiveId);
}
