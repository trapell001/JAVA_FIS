package DAO.Detective;

import DAO.IBaseDao;
import Model.Detective;

import java.util.List;
import java.util.Optional;

public class DetectiveDAO implements IBaseDao<Detective> {
    @Override
    public List<Detective> getAll() {
        return null;
    }

    @Override
    public Optional<Detective> get(long id) {
        return Optional.empty();
    }

    @Override
    public void save(Detective detective) {

    }

    @Override
    public void update(Detective detective) {

    }

    @Override
    public void delete(Detective detective) {

    }
}
