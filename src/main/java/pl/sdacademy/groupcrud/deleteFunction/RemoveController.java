package pl.sdacademy.groupcrud.deleteFunction;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remove")
public class RemoveController {
    //remove Mapping
    @PostMapping("/{removeId}")
    public void removeId(@PathVariable Integer removeId){



    }

}
