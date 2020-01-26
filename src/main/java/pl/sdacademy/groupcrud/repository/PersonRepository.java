package pl.sdacademy.groupcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.groupcrud.entity.Person;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
Person findPersonById(int id);
}
