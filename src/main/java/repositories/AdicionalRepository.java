package repositories;

import entities.adicional.Adicional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdicionalRepository extends CrudRepository<Adicional, Integer> {
}
