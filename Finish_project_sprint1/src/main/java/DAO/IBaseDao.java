package DAO;

import java.util.List;
import java.util.Optional;

public interface IBaseDao<T> {
    List<T> getAll();
    Optional<T> get(long id);

    void save(T t);

    void update(T t);

    void delete(T t);
}
