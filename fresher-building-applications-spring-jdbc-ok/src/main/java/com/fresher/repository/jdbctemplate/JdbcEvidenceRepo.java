package com.fresher.repository.jdbctemplate;

import com.fresher.model.CriminalCase;
import com.fresher.model.Evidence;
import com.fresher.model.Storage;
import com.fresher.repository.EvidenceRepo;

import java.util.Optional;
import java.util.Set;

public class JdbcEvidenceRepo implements EvidenceRepo {
    @Override
    public void save(Evidence entity) {

    }

    @Override
    public void delete(Evidence entity) {

    }

    @Override
    public Evidence update(Evidence entity) {
        return null;
    }

    @Override
    public int deleteById(Long entityId) {
        return 0;
    }

    @Override
    public Optional<Evidence> findById(Long entityId) {
        return Optional.empty();
    }

    @Override
    public Set<Evidence> findByCriminalCase(CriminalCase criminalCase) {
        return null;
    }

    @Override
    public Optional<Evidence> findByNumber(String evidenceNumber) {
        return Optional.empty();
    }

    @Override
    public boolean isInStorage(Storage storage) {
        return false;
    }
    //TODO ...
}
