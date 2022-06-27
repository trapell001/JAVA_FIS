package com.example.project_sprint_04.service;

import com.example.project_sprint_04.entity.Evidence;
import com.example.project_sprint_04.entity.Storage;

import java.util.List;

public interface StorageService {
    List<Evidence> findAll();
    Evidence findStorageById(Long StorageById);
    Evidence creatStorage(Storage storage);
    void  deleteStorageById(Long storageId);
}
