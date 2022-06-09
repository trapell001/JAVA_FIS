package DAO.Criminal;

import Model.CriminalCase;

import java.util.List;
import java.util.Optional;

public class CriminalDAO implements ICrintiminalDAO {
    @Override
    public List<CriminalCase> getAll() {
        return null;
    }

    @Override
    public Optional<CriminalCase> get(long id) {
        return Optional.empty();
    }

    @Override
    public void save(CriminalCase criminalCase) {

    }

    @Override
    public void update(CriminalCase criminalCase) {

    }

    @Override
    public void delete(CriminalCase criminalCase) {

    }
}
