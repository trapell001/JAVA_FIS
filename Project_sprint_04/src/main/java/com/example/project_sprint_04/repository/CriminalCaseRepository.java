package com.example.project_sprint_04.repository;

import com.example.project_sprint_04.entity.CriminalCase;
import org.springframework.stereotype.Repository;

@Repository
public interface CriminalCaseRepository extends BaseRepository<CriminalCase, Long> {
}
