package pl.sdacademy.groupcrud.deleteFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remove")
public class RemoveController {
    //remove Mapping
        private final QueryRemove query;

    public RemoveController(QueryRemove query) {
        this.query = query;
    }


    @GetMapping("/{removeId}")
    public String removeReceive(@PathVariable("removeId") Integer removeId){
        query.deleteByIdEquals(removeId);
        return "usunieto"+removeId;

    }

}