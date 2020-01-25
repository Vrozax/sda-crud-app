package pl.sdacademy.groupcrud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


    @Repository
    public interface PersonRepository extends CrudRepository<Person, Integer> {
        Collection<Person> findAllByModel(String model);
}
