package repositories;

import entities.Automovil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilRepository extends CrudRepository<Automovil, Integer> {
}
