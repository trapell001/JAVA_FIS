package DAO.Evidence;

import DAO.IBaseDao;
import Model.Evidenci;

import java.util.List;
import java.util.Optional;

public class EvidenceDao implements IBaseDao<Evidenci> {
    @Override
    public List<Evidenci> getAll() {
        return null;
    }

    @Override
    public Optional<Evidenci> get(long id) {
        return Optional.empty();
    }

    @Override
    public void save(Evidenci evidenci) {

    }

    @Override
    public void update(Evidenci evidenci) {

    }

    @Override
    public void delete(Evidenci evidenci) {

    }
}
