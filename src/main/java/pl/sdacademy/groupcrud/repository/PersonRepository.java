package pl.sdacademy.groupcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.groupcrud.entity.Person;

import java.util.Optional;


@Repository
    public interface PersonRepository extends CrudRepository<Person, Integer> {
 public Optional<Person> findPersonById(int id);
}
