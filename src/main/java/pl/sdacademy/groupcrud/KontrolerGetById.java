package pl.sdacademy.groupcrud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.groupcrud.entity.Person;
import pl.sdacademy.groupcrud.repository.PersonRepository;

import java.util.Optional;

@RestController
public class KontrolerGetById {
    PersonRepository personRepository;

    public KontrolerGetById(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/getbyID/{id}")
    public Optional<Person> getbyID(@PathVariable int id) {
        Optional<Person> result = personRepository.findPersonById(id);
        if (!result.isPresent()) {
            System.out.println("Nie ma takiego użytkowanika");
        } else {
            return result;
        }
        return null;
    }

}


