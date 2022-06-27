package com.example.project_sprint_03.service;

import com.example.project_sprint_03.entity.Detective;
import com.example.project_sprint_03.entity.Evidence;

import java.util.List;

public interface DetectiveService {
    List<Detective> findAll();
    Detective findDetectiveById(Long detectiveId);
    Detective createDetective(Detective detective);
    Detective updateDetective(Detective detective);
    void deleteDetectiveById(Long detectiveId);
}
