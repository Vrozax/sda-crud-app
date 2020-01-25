package pl.sdacademy.groupcrud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class KontrolerGetById {
        @GetMapping("/getbyID"/{identyfikacja})
    public Collection<Person> getbyID(@PathVariable int identyfikacja) {
        return ContactRepository.getbyID(id);
//     @Query("select * from contacts where id = {identyfikacja}")}

