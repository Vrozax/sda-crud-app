package pl.sdacademy.groupcrud.deleteFunction;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remove")
public class RemoveController {
    //remove Mapping
    @PostMapping("/{removeId}")

    public String removeReceive(@PathVariable Integer removeReceiveData){
        removeById(removeReceiveData);
    return "usunieto";

    }
    @Query(value = "DELETE FROM contact WHERE :removeId")
    public void removeById(@Param("removeId") Integer removeId){

    }
}
