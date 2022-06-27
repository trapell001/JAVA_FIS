package com.example.project_sprint_03.service;

import com.example.project_sprint_03.entity.Evidence;
import com.example.project_sprint_03.entity.Storage;

import java.util.List;

public interface StorageService {
    List<Evidence> findAll();
    Evidence findStorageById(Long StorageById);
    Evidence creatStorage(Storage storage);
    void deleteStorageById(Long storageId);
}
