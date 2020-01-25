package pl.sdacademy.groupcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class GroupCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroupCrudApplication.class, args);
        //to jest komentarz
    }

//    p@GetMapping("/getbyID" / {id})
//    public Collection<Person> getbyID(@PathVariable int identyfikacja) {
//        return ContactRepository.getbyID(id);
    // select * from contacts where id = {identyfikacja}
    }
}





}
