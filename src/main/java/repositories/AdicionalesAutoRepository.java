package repositories;

import entities.AdicionalesAuto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdicionalesAutoRepository extends CrudRepository<AdicionalesAuto, Integer> {
}
