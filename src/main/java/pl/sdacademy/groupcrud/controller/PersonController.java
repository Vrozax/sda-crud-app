package pl.sdacademy.groupcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sdacademy.groupcrud.entity.Person;
import pl.sdacademy.groupcrud.repository.PersonRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public List<Person> getContacts() {

        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(personList::add);
        return personList;
    }
//metoda post
    @PostMapping
    public Person add(@RequestBody Person person) {
      return personRepository.save(person);

    }
}



