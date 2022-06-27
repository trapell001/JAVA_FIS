package com.example.project_sprint_04.service.Impl;

import com.example.project_sprint_04.entity.Detective;
import com.example.project_sprint_04.repository.DetectiveRepository;
import com.example.project_sprint_04.service.DetectiveService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetectiveServiceImpl implements DetectiveService {
    private DetectiveRepository detectiveRepository;
    @Autowired
    public DetectiveServiceImpl(DetectiveRepository detectiveRepository) {
        this.detectiveRepository = detectiveRepository;
    }
    @Override
    public List<Detective> findAll() {
        return detectiveRepository.findAll();
    }

    @Override
    public Detective findDetectiveById(Long detectiveId) {
        return detectiveRepository.findById(detectiveId).get();
    }

    @Override
    public Detective createDetective(Detective detective) {
        return detectiveRepository.save(detective);
    }

    @Override
    public Detective updateDetective(Detective detective) {
        return detectiveRepository.save(detective);
    }

    @Override
    public void deleteDetectiveById(Long detectieId) {

    }
}
